package com.cloudkeeper.leasing.identity.controller.impl;

import com.cloudkeeper.leasing.base.model.Result;
import com.cloudkeeper.leasing.identity.controller.TbProblemController;
import com.cloudkeeper.leasing.identity.domain.TbProblem;
import com.cloudkeeper.leasing.identity.dto.tbproblem.TbProblemDTO;
import com.cloudkeeper.leasing.identity.dto.tbproblem.TbProblemSearchable;
import com.cloudkeeper.leasing.identity.service.TbProblemService;
import com.cloudkeeper.leasing.identity.vo.TbProblemVO;
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
 * 问题定位 controller
 * @author lxw
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TbProblemControllerImpl implements TbProblemController {

    /** 问题定位 service */
    private final TbProblemService tbProblemService;

    @Override
    public Result<TbProblemVO> findOne(@ApiParam(value = "问题定位id", required = true) @PathVariable String id) {
        Optional<TbProblem> tbProblemOptional = tbProblemService.findOptionalById(id);
        return tbProblemOptional.map(tbProblem -> Result.of(tbProblem.convert(TbProblemVO.class))).orElseGet(Result::ofNotFound);
    }

    @Override
    public Result<TbProblemVO> add(@ApiParam(value = "问题定位 DTO", required = true) @RequestBody @Validated TbProblemDTO tbProblemDTO) {
        TbProblem tbProblem = tbProblemService.save(tbProblemDTO.convert(TbProblem.class));
        return Result.ofAddSuccess(tbProblem.convert(TbProblemVO.class));
    }

    @Override
    public Result<TbProblemVO> update(@ApiParam(value = "问题定位id", required = true) @PathVariable String id,
        @ApiParam(value = "问题定位 DTO", required = true) @RequestBody @Validated TbProblemDTO tbProblemDTO) {
        Optional<TbProblem> tbProblemOptional = tbProblemService.findOptionalById(id);
        if (!tbProblemOptional.isPresent()) {
            return Result.ofLost();
        }
        TbProblem tbProblem = tbProblemOptional.get();
        BeanUtils.copyProperties(tbProblemDTO, tbProblem);
        tbProblem = tbProblemService.save(tbProblem);
        return Result.ofUpdateSuccess(tbProblem.convert(TbProblemVO.class));
    }

    @Override
    public Result delete(@ApiParam(value = "问题定位id", required = true) @PathVariable String id) {
        tbProblemService.deleteById(id);
        return Result.ofDeleteSuccess();
    }

    @Override
    public Result<List<TbProblemVO>> list(@ApiParam(value = "问题定位查询条件", required = true) @RequestBody TbProblemSearchable tbProblemSearchable,
        @ApiParam(value = "排序条件", required = true) Sort sort) {
        List<TbProblem> tbProblemList = tbProblemService.findAll(tbProblemSearchable, sort);
        List<TbProblemVO> tbProblemVOList = TbProblem.convert(tbProblemList, TbProblemVO.class);
        return Result.of(tbProblemVOList);
    }

    @Override
    public Result<Page<TbProblemVO>> page(@ApiParam(value = "问题定位查询条件", required = true) @RequestBody TbProblemSearchable tbProblemSearchable,
        @ApiParam(value = "分页参数", required = true) Pageable pageable) {
        Page<TbProblem> tbProblemPage = tbProblemService.findAll(tbProblemSearchable, pageable);
        Page<TbProblemVO> tbProblemVOPage = TbProblem.convert(tbProblemPage, TbProblemVO.class);
        return Result.of(tbProblemVOPage);
    }

}