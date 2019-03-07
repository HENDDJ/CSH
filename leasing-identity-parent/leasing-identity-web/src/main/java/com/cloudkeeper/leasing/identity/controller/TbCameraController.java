package com.cloudkeeper.leasing.identity.controller;

import com.cloudkeeper.leasing.identity.dto.tbcamera.TbCameraDTO;
import com.cloudkeeper.leasing.identity.dto.tbcamera.TbCameraSearchable;
import com.cloudkeeper.leasing.identity.vo.TbCameraVO;
import com.cloudkeeper.leasing.base.model.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 摄像头配置 controller
 * @author lxw
 */
@Api(value = "摄像头配置", tags = "摄像头配置")
@RequestMapping("/tbCamera")
public interface TbCameraController {

    /**
     * 查询
     * @param id 摄像头配置id
     * @return 摄像头配置 VO
     */
    @ApiOperation(value = "查询", notes = "查询", position = 1)
    @GetMapping("/{id}id")
    Result<TbCameraVO> findOne(@ApiParam(value = "摄像头配置id", required = true) @PathVariable String id);

    /**
     * 新增
     * @param tbCameraDTO 摄像头配置 DTO
     * @return 摄像头配置 VO
     */
    @ApiOperation(value = "新增", notes = "新增", position = 2)
    @PostMapping("/")
    Result<TbCameraVO> add(@ApiParam(value = "摄像头配置 DTO", required = true) @RequestBody @Validated TbCameraDTO tbCameraDTO);

    /**
     * 更新
     * @param id 摄像头配置id
     * @param tbCameraDTO 摄像头配置 DTO
     * @return 摄像头配置 VO
     */
    @ApiOperation(value = "更新", notes = "更新", position = 3)
    @PutMapping("/{id}id")
    Result<TbCameraVO> update(@ApiParam(value = "摄像头配置id", required = true) @PathVariable String id,
        @ApiParam(value = "摄像头配置 DTO", required = true) @RequestBody @Validated TbCameraDTO tbCameraDTO);

    /**
     * 删除
     * @param id 摄像头配置id
     * @return 删除结果
     */
    @ApiOperation(value = "删除", notes = "删除", position = 4)
    @DeleteMapping("/{id}id")
    Result delete(@ApiParam(value = "摄像头配置id", required = true) @PathVariable String id);

    /**
     * 列表查询
     * @param tbCameraSearchable 摄像头配置查询条件
     * @param sort 排序条件
     * @return 摄像头配置 VO 集合
     */
    @ApiOperation(value = "列表查询", notes = "列表查询<br/>sort：排序字段，默认是asc排序方式，可以不写，格式：sort=code,asc&sort=name&sort=note,desc", position = 5)
    @PostMapping("/list")
    Result<List<TbCameraVO>> list(@ApiParam(value = "摄像头配置查询条件", required = true) @RequestBody TbCameraSearchable tbCameraSearchable,
        @ApiParam(value = "排序条件", required = true) Sort sort);

    /**
     * 分页查询
     * @param tbCameraSearchable 摄像头配置查询条件
     * @param pageable 分页条件
     * @return 摄像头配置 VO 分页
     */
    @ApiOperation(value = "分页查询", notes = "分页查询<br/>page：第几页，默认为0，是第一页<br/>size：分页大小, 默认为10<br/>sort：排序字段，默认是asc排序方式，可以不写，格式：sort=code,asc&sort=name&sort=note,desc", position = 6)
    @PostMapping("/page")
    Result<Page<TbCameraVO>> page(@ApiParam(value = "摄像头配置查询条件", required = true) @RequestBody TbCameraSearchable tbCameraSearchable,
        @ApiParam(value = "分页参数", required = true) Pageable pageable);

}