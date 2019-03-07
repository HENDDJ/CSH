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
import java.time.LocalDate;

/**
 * 摄像头配置
 * @author lxw
 */
@ApiModel(value = "摄像头配置", description = "摄像头配置")
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_camera")
public class TbCamera extends BaseEntity {

    /** 名称 */
    @ApiModelProperty(value = "", position = 10, required = true)
    @Column(length = 60)
    private Integer cameraId;

    @ApiModelProperty(value = "", position = 10, required = true)
    @Column(length = 60)
    private String cameraUuid;

    @ApiModelProperty(value = "", position = 10, required = true)
    @Column(length = 60)
    private String cameraName;

    @ApiModelProperty(value = "", position = 10, required = true)
    @Column(length = 60)
    private String cameraType;

    @ApiModelProperty(value = "", position = 10, required = true)
    @Column(length = 60)
    private String cameraChannelNum;

    @ApiModelProperty(value = "", position = 10, required = true)
    @Column(length = 60)
    private String smartType;

    @ApiModelProperty(value = "", position = 10, required = true)
    @Column(length = 60)
    private String smartSupport;

    @ApiModelProperty(value = "", position = 10, required = true)
    @Column(length = 60)
    private String onlineStatus;

    @ApiModelProperty(value = "", position = 10, required = true)
    @Column(length = 60)
    private String keyBoardCode;

    @ApiModelProperty(value = "", position = 10, required = true)
    @Column(length = 60)
    private String orderNum;

    @ApiModelProperty(value = "", position = 10, required = true)
    @Column(length = 60)
    private LocalDate updateTime;

    @ApiModelProperty(value = "", position = 10, required = true)
    @Column(length = 60)
    private String unitUuid;

    @ApiModelProperty(value = "", position = 10, required = true)
    @Column(length = 60)
    private String regionUuid;

    @ApiModelProperty(value = "", position = 10, required = true)
    @Column(length = 60)
    private String encoderUuid;

    @ApiModelProperty(value = "", position = 10, required = true)
    @Column(length = 60)
    private String resAuths;

    @ApiModelProperty(value = "", position = 10, required = true)
    @Column(length = 60)
    private String xloc;

    @ApiModelProperty(value = "", position = 10, required = true)
    @Column(length = 60)
    private String yloc;



}
