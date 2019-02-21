package com.cloudkeeper.leasing.identity.dto.sysloginlog;

import com.cloudkeeper.leasing.base.dto.BaseSearchable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 类属性配置 查询DTO
 * @author lxw
 */
@ApiModel(value = "类属性配置 查询DTO", description = "类属性配置 查询DTO")
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class SysLoginLogSearchable extends BaseSearchable {

    /** 用户ID */
    @ApiModelProperty(value = "用户ID", position = 10, required = true)
    private String userId;

    /** 用户name */
    @ApiModelProperty(value = "用户name", position = 12, required = true)
    private String userName;

    /** 登陆时间 */
    @ApiModelProperty(value = "登陆时间", position = 14, required = true)
    private LocalDateTime loginTime;

    /** 登录成功 */
    @ApiModelProperty(value = "登录成功", position = 16, required = true)
    private String success;

    /** 开始时间 */
    @ApiModelProperty(value = "开始时间", position = 14, required = true)
    private LocalDateTime startTime;

    /** 结束时间 */
    @ApiModelProperty(value = "结束时间", position = 14, required = true)
    private LocalDateTime endTime;



}
