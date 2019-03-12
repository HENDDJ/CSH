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
import java.time.LocalDateTime;

/**
 * 问题定位
 * @author lxw
 */
@ApiModel(value = "问题定位", description = "问题定位")
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_problem")
public class TbProblem extends BaseEntity {

    @ApiModelProperty(value = "problemName", position = 10, required = true)
    @Column(length = 60)
    private String problemName;

    @ApiModelProperty(value = "type", position = 10, required = true)
    @Column(length = 60)
    private String type;

    @ApiModelProperty(value = "message", position = 10, required = true)
    @Column(length = 60)
    private String message;

    @ApiModelProperty(value = "imgUrl", position = 10, required = true)
    @Column(length = 60)
    private String imgUrl;

    @ApiModelProperty(value = "xloc", position = 10, required = true)
    @Column(length = 60)
    private String xloc;

    @ApiModelProperty(value = "yloc", position = 10, required = true)
    @Column(length = 60)
    private String yloc;

    @ApiModelProperty(value = "submissionTime", position = 10, required = true)
    @Column(length = 60)
    private LocalDateTime submissionTime;

    @ApiModelProperty(value = "submitter", position = 10, required = true)
    @Column(length = 60)
    private String submitter;

}
