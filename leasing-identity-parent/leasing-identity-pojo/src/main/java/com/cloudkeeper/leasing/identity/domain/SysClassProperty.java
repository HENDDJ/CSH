package com.cloudkeeper.leasing.identity.domain;

import com.cloudkeeper.leasing.base.domain.BaseEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;

/**
 * 类属性配置
 * @author asher
 */
@ApiModel(value = "类属性配置", description = "类属性配置")
@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "sys_class_property")
public class SysClassProperty extends BaseEntity {

    /** 类id */
    @ApiModelProperty(value = "所属类id", position = 1, required = true)
    @Column(length = 36)
    private String classId;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "classId", insertable = false, updatable = false)
    private SysClass sysClass;

    /** 属性名 */
    @ApiModelProperty(value = "属性名", position = 3, required = true)
    @Column(length = 36)
    private String name;

    /** 数据类型 */
    @ApiModelProperty(value = "数据类型", position = 5)
    @Column(length = 50)
    private String type;

    /** 长度 */
    @ApiModelProperty(value = "长度", position = 7)
    private Integer length;

    /** 属性描述 */
    @ApiModelProperty(value = "属性描述", position = 9)
    @Column(length = 200)
    private String des;

    /** 排序 */
    @ApiModelProperty(value = "排序", position = 11)
    private Integer sort;

    /** 该属性是否是对象 */
    @ApiModelProperty(value = "该属性是否是对象", position = 13)
    @Column(length = 36)
    private String isObject;

    /** 该属性是对象，所关联的类id */
    @ApiModelProperty(value = "该属性是对象，所关联的类id", position = 15)
    @Column(length = 36)
    private String objectId;

    /** 该属性是对象，所关联的对象 */
    @ApiModelProperty(value = "该属性是对象，所关联的对象", position = 17)
    @OneToOne
    @JoinColumn(name = "objectId", insertable = false, updatable = false)
    private SysClass obj;

}