package com.cloudkeeper.leasing.identity.controller.impl;

import com.cloudkeeper.leasing.base.model.Result;
import com.cloudkeeper.leasing.identity.controller.TbCameraController;
import com.cloudkeeper.leasing.identity.domain.TbCamera;
import com.cloudkeeper.leasing.identity.dto.tbcamera.TbCameraDTO;
import com.cloudkeeper.leasing.identity.dto.tbcamera.TbCameraSearchable;
import com.cloudkeeper.leasing.identity.service.TbCameraService;
import com.cloudkeeper.leasing.identity.vo.TbCameraVO;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/**
 * 摄像头配置 controller
 * @author lxw
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TbCameraControllerImpl implements TbCameraController {

    /** 摄像头配置 service */
    private final TbCameraService tbCameraService;

    @Override
    public Result<TbCameraVO> findOne(@ApiParam(value = "摄像头配置id", required = true) @PathVariable String id) {
        Optional<TbCamera> tbCameraOptional = tbCameraService.findOptionalById(id);
        return tbCameraOptional.map(tbCamera -> Result.of(tbCamera.convert(TbCameraVO.class))).orElseGet(Result::ofNotFound);
    }

    @Override
    public Result<TbCameraVO> add(@ApiParam(value = "摄像头配置 DTO", required = true) @RequestBody @Validated TbCameraDTO tbCameraDTO) {
        TbCamera tbCamera = tbCameraService.save(tbCameraDTO.convert(TbCamera.class));
        return Result.ofAddSuccess(tbCamera.convert(TbCameraVO.class));
    }

    @Override
    public Result<TbCameraVO> update(@ApiParam(value = "摄像头配置id", required = true) @PathVariable String id,
        @ApiParam(value = "摄像头配置 DTO", required = true) @RequestBody @Validated TbCameraDTO tbCameraDTO) {
        Optional<TbCamera> tbCameraOptional = tbCameraService.findOptionalById(id);
        if (!tbCameraOptional.isPresent()) {
            return Result.ofLost();
        }
        TbCamera tbCamera = tbCameraOptional.get();
        BeanUtils.copyProperties(tbCameraDTO, tbCamera);
        tbCamera = tbCameraService.save(tbCamera);
        return Result.ofUpdateSuccess(tbCamera.convert(TbCameraVO.class));
    }

    @Override
    public Result delete(@ApiParam(value = "摄像头配置id", required = true) @PathVariable String id) {
        tbCameraService.deleteById(id);
        return Result.ofDeleteSuccess();
    }

    @Override
    public Result<List<TbCameraVO>> list(@ApiParam(value = "摄像头配置查询条件", required = true) @RequestBody TbCameraSearchable tbCameraSearchable,
        @ApiParam(value = "排序条件", required = true) Sort sort) {
        List<TbCamera> tbCameraList = tbCameraService.findAll(tbCameraSearchable, sort);
        List<TbCameraVO> tbCameraVOList = TbCamera.convert(tbCameraList, TbCameraVO.class);
        return Result.of(tbCameraVOList);
    }

    @Override
    public Result<Page<TbCameraVO>> page(@ApiParam(value = "摄像头配置查询条件", required = true) @RequestBody TbCameraSearchable tbCameraSearchable,
        @ApiParam(value = "分页参数", required = true) Pageable pageable) {
        Page<TbCamera> tbCameraPage = tbCameraService.findAll(tbCameraSearchable, pageable);
        Page<TbCameraVO> tbCameraVOPage = TbCamera.convert(tbCameraPage, TbCameraVO.class);
        return Result.of(tbCameraVOPage);
    }

}