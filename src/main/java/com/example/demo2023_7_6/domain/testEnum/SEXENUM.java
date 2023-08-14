package com.example.demo2023_7_6.domain.testEnum;

import lombok.Data;

/**
 * @author yuanyi
 * @date 2023/8/2 11:40
 */
public enum SEXENUM {
    /**
     * 名称
     */
    BOY(0,"男"),
    GIRL(1, "女"),
    OTHER(3, "保密");

    /**
     * 代码
     */
   private Integer code;
    /**
     * 描述
     */
   private String sex;

    /**
     * 构造方法
     * @param code
     * @param sexEnum
     */
    SEXENUM(Integer code, String sexEnum) {
        this.code=code;
        this.sex = sexEnum;
    }

    public Integer getCode() {
        return code;
    }

    public String getSex() {
        return sex;
    }

}
