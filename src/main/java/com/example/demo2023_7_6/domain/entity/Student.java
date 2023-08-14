package com.example.demo2023_7_6.domain.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @author yuanyi
 * @date 2023-07-07 15:58:04
 * 实体类
 */
@Data
@TableName(value = "student", autoResultMap = true)
public class Student {

    /**
     *
     */
    @TableId(type = IdType.ASSIGN_ID)
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
    private String sex;

    /**
     *
     */
    private String idcar;

    /**
     *
     */
    private Date birthday;
}
