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
 * 摄像头配置 VO
 * @author lxw
 */
@ApiModel(value = "摄像头配置 VO", description = "摄像头配置 VO")
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class TbCameraVO extends BaseVO {

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
