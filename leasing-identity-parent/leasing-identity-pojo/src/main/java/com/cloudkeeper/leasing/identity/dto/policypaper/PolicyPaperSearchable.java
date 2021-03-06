package com.cloudkeeper.leasing.identity.dto.policypaper;

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
 * @author cqh
 */
@ApiModel(value = "类属性配置 查询DTO", description = "类属性配置 查询DTO")
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class PolicyPaperSearchable extends BaseSearchable {

    /** 标题 */
    @ApiModelProperty(value = "标题", position = 10, required = true)
    private String title;

    /** 作者 */
    @ApiModelProperty(value = "作者", position = 10, required = true)
    private String author;

    /** 内容 */
    @ApiModelProperty(value = "内容", position = 10, required = true)
    private String content;

    /** 附件 */
    @ApiModelProperty(value = "附件", position = 10, required = true)
    private String enclosure;

    /** 所属部门 */
    @ApiModelProperty(value = "所属部门", position = 10, required = true)
    private String organizationId;

}