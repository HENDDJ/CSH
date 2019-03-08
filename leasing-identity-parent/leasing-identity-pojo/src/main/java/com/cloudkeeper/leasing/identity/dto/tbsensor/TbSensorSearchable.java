package com.cloudkeeper.leasing.identity.dto.tbsensor;

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
 * 传感器 查询DTO
 * @author lxw
 */
@ApiModel(value = "传感器 查询DTO", description = "传感器 查询DTO")
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class TbSensorSearchable extends BaseSearchable {

    /** sensorId */
    @ApiModelProperty(value = "sensorId", position = 10, required = true)
    private String sensorId;

    /** sensorName */
    @ApiModelProperty(value = "sensorName", position = 10, required = true)
    private String sensorName;

    /** sensorType */
    @ApiModelProperty(value = "sensorType", position = 10, required = true)
    private String sensorType;

    /** sensorUrl */
    @ApiModelProperty(value = "sensorUrl", position = 10, required = true)
    private String sensorUrl;

    /** message */
    @ApiModelProperty(value = "message", position = 10, required = true)
    private String message;

    /** xloc */
    @ApiModelProperty(value = "xloc", position = 10, required = true)
    private String xloc;

    /** yloc */
    @ApiModelProperty(value = "yloc", position = 10, required = true)
    private String yloc;

}
