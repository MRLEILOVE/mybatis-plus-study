package com.leigq.www.mybatisplusstudy.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* Created by Mybatis Generator 2019/06/14
*/
@EqualsAndHashCode(callSuper = true)
@ApiModel(value="com.leigq.www.mybatisplusstudy.domain.entity.Staff")
@Data
@TableName(value = "staff")
@Builder
public class Staff extends Model<Staff> implements Serializable {
    /**
     * 主键
     */
     @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 姓名
     */
    @TableField(value = "name")
    @ApiModelProperty(value="姓名")
    private String name;

    /**
     * 年龄
     */
    @TableField(value = "age")
    @ApiModelProperty(value="年龄")
    private Short age;

    /**
     * 工龄
     */
    @TableField(value = "work_age")
    @ApiModelProperty(value="工龄")
    private Short workAge;

    /**
     * 工资(月)
     */
    @TableField(value = "wages")
    @ApiModelProperty(value="工资(月)")
    private BigDecimal wages;

    /**
     * 部门id
     */
    @TableField(value = "d_id")
    @ApiModelProperty(value="部门id")
    private Long dId;

    /**
     * 版本，乐观锁
     */
    @TableField(value = "version")
    @ApiModelProperty(value="版本，乐观锁")
    @Version
    private Integer version;

    private static final long serialVersionUID = 1L;
}