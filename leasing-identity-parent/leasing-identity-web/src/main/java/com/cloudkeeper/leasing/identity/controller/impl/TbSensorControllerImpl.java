package com.cloudkeeper.leasing.identity.controller.impl;

import com.cloudkeeper.leasing.base.model.Result;
import com.cloudkeeper.leasing.identity.controller.TbSensorController;
import com.cloudkeeper.leasing.identity.domain.TbSensor;
import com.cloudkeeper.leasing.identity.dto.tbsensor.TbSensorDTO;
import com.cloudkeeper.leasing.identity.dto.tbsensor.TbSensorSearchable;
import com.cloudkeeper.leasing.identity.service.TbSensorService;
import com.cloudkeeper.leasing.identity.vo.TbSensorVO;
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
 * 传感器 controller
 * @author lxw
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TbSensorControllerImpl implements TbSensorController {

    /** 传感器 service */
    private final TbSensorService tbSensorService;

    @Override
    public Result<TbSensorVO> findOne(@ApiParam(value = "传感器id", required = true) @PathVariable String id) {
        Optional<TbSensor> tbSensorOptional = tbSensorService.findOptionalById(id);
        return tbSensorOptional.map(tbSensor -> Result.of(tbSensor.convert(TbSensorVO.class))).orElseGet(Result::ofNotFound);
    }

    @Override
    public Result<TbSensorVO> add(@ApiParam(value = "传感器 DTO", required = true) @RequestBody @Validated TbSensorDTO tbSensorDTO) {
        TbSensor tbSensor = tbSensorService.save(tbSensorDTO.convert(TbSensor.class));
        return Result.ofAddSuccess(tbSensor.convert(TbSensorVO.class));
    }

    @Override
    public Result<TbSensorVO> update(@ApiParam(value = "传感器id", required = true) @PathVariable String id,
        @ApiParam(value = "传感器 DTO", required = true) @RequestBody @Validated TbSensorDTO tbSensorDTO) {
        Optional<TbSensor> tbSensorOptional = tbSensorService.findOptionalById(id);
        if (!tbSensorOptional.isPresent()) {
            return Result.ofLost();
        }
        TbSensor tbSensor = tbSensorOptional.get();
        BeanUtils.copyProperties(tbSensorDTO, tbSensor);
        tbSensor = tbSensorService.save(tbSensor);
        return Result.ofUpdateSuccess(tbSensor.convert(TbSensorVO.class));
    }

    @Override
    public Result delete(@ApiParam(value = "传感器id", required = true) @PathVariable String id) {
        tbSensorService.deleteById(id);
        return Result.ofDeleteSuccess();
    }

    @Override
    public Result<List<TbSensorVO>> list(@ApiParam(value = "传感器查询条件", required = true) @RequestBody TbSensorSearchable tbSensorSearchable,
        @ApiParam(value = "排序条件", required = true) Sort sort) {
        List<TbSensor> tbSensorList = tbSensorService.findAll(tbSensorSearchable, sort);
        List<TbSensorVO> tbSensorVOList = TbSensor.convert(tbSensorList, TbSensorVO.class);
        return Result.of(tbSensorVOList);
    }

    @Override
    public Result<Page<TbSensorVO>> page(@ApiParam(value = "传感器查询条件", required = true) @RequestBody TbSensorSearchable tbSensorSearchable,
        @ApiParam(value = "分页参数", required = true) Pageable pageable) {
        Page<TbSensor> tbSensorPage = tbSensorService.findAll(tbSensorSearchable, pageable);
        Page<TbSensorVO> tbSensorVOPage = TbSensor.convert(tbSensorPage, TbSensorVO.class);
        return Result.of(tbSensorVOPage);
    }

}