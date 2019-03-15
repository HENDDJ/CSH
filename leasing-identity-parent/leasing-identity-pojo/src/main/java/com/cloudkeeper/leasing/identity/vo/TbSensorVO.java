package com.cloudkeeper.leasing.identity.vo;

import com.cloudkeeper.leasing.base.vo.BaseVO;
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
 * 传感器 VO
 * @author lxw
 */
@ApiModel(value = "传感器 VO", description = "传感器 VO")
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class TbSensorVO extends BaseVO {

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

    @ApiModelProperty(value = "temperature", position = 10, required = true)
    private String temperature;

    @ApiModelProperty(value = "humidity", position = 10, required = true)
    private String humidity;

    @ApiModelProperty(value = "waterLevel", position = 10, required = true)
    private String waterLevel;

    @ApiModelProperty(value = "windPower", position = 10, required = true)
    private String windPower;


}
