package com.cloudkeeper.leasing.identity.dto.tbcamera;

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
 * 摄像头配置 查询DTO
 * @author lxw
 */
@ApiModel(value = "摄像头配置 查询DTO", description = "摄像头配置 查询DTO")
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class TbCameraSearchable extends BaseSearchable {

    private Integer cameraId;

    private String cameraUuid;

    private String cameraName;

    private String cameraType;

    private String cameraChannelNum;

    private String smartType;

    private String smartSupport;

    private String onlineStatus;

    private String keyBoardCode;

    private String orderNum;

    private LocalDate updateTime;

    private String unitUuid;

    private String regionUuid;

    private String encoderUuid;

    private String resAuths;

    private String xloc;

    private String yloc;

}
