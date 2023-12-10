package com.demo.vue.demo.domain.DTO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author 呙启伟
 * @date 2023/12/10 20:35
 */
@Data
@ApiModel(value = "学生添加对象")
public class StudentDTO {
    @ApiModelProperty(value = "姓名", required = true)
    private String name;

    /**
     *
     */
    @ApiModelProperty(value = "年龄", required = true)
    private Integer age;

    /**
     *
     */
    @ApiModelProperty(value = "身高", required = true)
    private Double height;

    /**
     *
     */
    @ApiModelProperty(value = "生日", required = true)
    private Date birthday;
}
