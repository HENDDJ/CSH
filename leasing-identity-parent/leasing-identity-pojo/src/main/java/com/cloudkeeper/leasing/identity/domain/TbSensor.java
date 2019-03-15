package com.cloudkeeper.leasing.identity.domain;

import com.cloudkeeper.leasing.base.domain.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 传感器
 * @author lxw
 */
@ApiModel(value = "传感器", description = "传感器")
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_sensor")
public class TbSensor extends BaseEntity {

    /** 名称 */
    @ApiModelProperty(value = "sensorId", position = 10, required = true)
    @Column(length = 60)
    private String sensorId;

    @ApiModelProperty(value = "sensorName", position = 10, required = true)
    @Column(length = 60)
    private String sensorName;

    @ApiModelProperty(value = "sensorType", position = 10, required = true)
    @Column(length = 60)
    private String sensorType;

    @ApiModelProperty(value = "sensorUrl", position = 10, required = true)
    @Column(length = 60)
    private String sensorUrl;

    @ApiModelProperty(value = "message", position = 10, required = true)
    @Column(length = 60)
    private String message;

    @ApiModelProperty(value = "xloc", position = 10, required = true)
    @Column(length = 60)
    private String xloc;

    @ApiModelProperty(value = "yloc", position = 10, required = true)
    @Column(length = 60)
    private String yloc;

    @ApiModelProperty(value = "temperature", position = 10, required = true)
    @Column(length = 60)
    private String temperature;

    @ApiModelProperty(value = "humidity", position = 10, required = true)
    @Column(length = 60)
    private String humidity;

    @ApiModelProperty(value = "waterlevel", position = 10, required = true)
    @Column(length = 60)
    private String waterLevel;

    @ApiModelProperty(value = "windpower", position = 10, required = true)
    @Column(length = 60)
    private String windPower;

}
