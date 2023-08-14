package com.example.demo2023_7_6.hanlde.point;

import com.example.demo2023_7_6.hanlde.AOP.AnnotationTest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author yuanyi
 * @date 2023/8/9 15:30
 */
@Aspect
@Component
public class pointTest {

    @Pointcut("@annotation(com.example.demo2023_7_6.hanlde.AOP.AnnotationTest) || @within(com.example.demo2023_7_6.hanlde.AOP.AnnotationTest)")
    public void point() {

    }

    @Before("point()")
    public void before(JoinPoint targetPoint) {

        // 获取这个方法的签名
        final MethodSignature signature = (MethodSignature) targetPoint.getSignature();
        System.out.println(signature);
        System.out.println(signature.getName());

        System.out.println("--------------------------");

        // 获取这个方法的类
        final Class declaringType = signature.getDeclaringType();
        System.out.println(declaringType);

        System.out.println("--------------------------");

        // 获取注解上面的某个值
        final Method method = signature.getMethod();
        System.out.println(method);
        AnnotationTest annotation = method.getAnnotation(AnnotationTest.class);
        annotation = annotation == null ?  (AnnotationTest) declaringType.getAnnotation(AnnotationTest.class) : annotation;
        System.out.println(annotation);
        System.out.println(annotation == null ? null : annotation.value());


    }
}
