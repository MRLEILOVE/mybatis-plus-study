package com.leigq.www.mybatisplusstudy.domain.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
* Created by Mybatis Generator 2019/06/14
*/
@EqualsAndHashCode(callSuper = true)
@Data
@TableName(value = "staff")
@Builder
public class Staff extends Model<Staff> implements Serializable {
    /**
     * 主键
     */
     @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 姓名
     */
    @TableField(value = "name")
    private String name;

    /**
     * 年龄
     */
    @TableField(value = "age")
    private Short age;

    /**
     * 工龄
     */
    @TableField(value = "work_age")
    private Short workAge;

    /**
     * 工资(月)
     */
    @TableField(value = "wages")
    private BigDecimal wages;

    /**
     * 部门id
     */
    @TableField(value = "d_id")
    private Long dId;

    /**
     * 版本，乐观锁
     */
    @TableField(value = "version")
    @Version
    private Integer version;

    private static final long serialVersionUID = 1L;
}