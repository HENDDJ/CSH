package com.cloudkeeper.leasing.identity.dto.tbproblem;

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
 * 问题定位 查询DTO
 * @author lxw
 */
@ApiModel(value = "问题定位 查询DTO", description = "问题定位 查询DTO")
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class TbProblemSearchable extends BaseSearchable {

    /** problemName */
    @ApiModelProperty(value = "problemName", position = 10, required = true)
    private String problemName;

    /** type */
    @ApiModelProperty(value = "type", position = 10, required = true)
    private String type;

    /** message */
    @ApiModelProperty(value = "message", position = 10, required = true)
    private String message;

    /** imgUrl */
    @ApiModelProperty(value = "imgUrl", position = 10, required = true)
    private String imgUrl;

    /** xloc */
    @ApiModelProperty(value = "xloc", position = 10, required = true)
    private String xloc;

    /** yloc */
    @ApiModelProperty(value = "yloc", position = 10, required = true)
    private String yloc;

    @ApiModelProperty(value = "submissionTime", position = 10, required = true)
    private LocalDate submissionTime;

    @ApiModelProperty(value = "submitter", position = 10, required = true)
    private String submitter;

}
