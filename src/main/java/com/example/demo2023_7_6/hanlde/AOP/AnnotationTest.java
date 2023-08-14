package com.example.demo2023_7_6.hanlde.AOP;

import java.lang.annotation.*;

/**
 * @author yuanyi
 * @date 2023/8/9 15:27
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AnnotationTest {
    String value() default "";
}
