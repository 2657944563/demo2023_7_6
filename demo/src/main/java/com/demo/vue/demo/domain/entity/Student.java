package com.demo.vue.demo.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author yuanyi
 * @date 2023-12-10 19:55:19
 * 实体类
 */
@Data
@TableName("student")
@ApiModel("学生实体对象")
public class Student {

    /**
     *
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private Integer age;

    /**
     *
     */
    private Double height;

    /**
     *
     */
    private Date birthday;
}
