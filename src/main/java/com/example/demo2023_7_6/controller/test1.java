package com.example.demo2023_7_6.controller;

import com.example.demo2023_7_6.hanlde.AOP.AnnotationTest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuanyi
 * @date 2023/7/6 15:48
 */
@Slf4j
@RequestMapping("test")
@RestController
@AnnotationTest("测试接口")
public class test1 {
    @GetMapping("1")
    public String test1() {
        log.error("slf4j test");
        return "成功测速1";
    }
}
