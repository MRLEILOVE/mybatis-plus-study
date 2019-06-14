package com.leigq.www.mybatisplusstudy.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
* Created by Mybatis Generator 2019/06/14
*/
@ApiModel(value="com.leigq.www.mybatisplusstudy.domain.entity.Department")
@Data
@TableName(value = "department")
public class Department implements Serializable {
    /**
     * 主键
     */
     @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="主键")
    private Long id;

    /**
     * 名称
     */
    @TableField(value = "name")
    @ApiModelProperty(value="名称")
    private String name;

    /**
     * 员工数量
     */
    @TableField(value = "staff_num")
    @ApiModelProperty(value="员工数量")
    private Short staffNum;

    private static final long serialVersionUID = 1L;
}