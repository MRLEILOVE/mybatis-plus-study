package com.leigq.www.mybatisplusstudy.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by Mybatis Generator 2019/06/14
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName(value = "department")
public class Department extends Model<Department> implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 员工数量
     */
    @TableField(value = "staff_num")
    private Short staffNum;

    private static final long serialVersionUID = 1L;
}