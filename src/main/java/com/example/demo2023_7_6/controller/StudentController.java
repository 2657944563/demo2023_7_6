package com.example.demo2023_7_6.controller;

import com.example.demo2023_7_6.domain.entity.Student;
import com.example.demo2023_7_6.hanlde.AOP.AnnotationTest;
import com.example.demo2023_7_6.service.IStudentService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yuanyi
 * @date 2023-07-07 15:58:04
 * 控制层
 */
@RestController
@RequestMapping("/student")
@AllArgsConstructor
@EqualsAndHashCode(of = {"beanFactory", "studentService"})
@Data
//public class StudentController implements BeanFactoryAware {
public class StudentController {

    private final BeanFactory beanFactory;
    private final IStudentService studentService;

    @AnnotationTest("测试student")
    @GetMapping("test/{id}")
    public String getStudentInfoById(@PathVariable("id") Integer id) {
        System.out.println(studentService);
        System.out.println(beanFactory);
        Student byId = studentService.getById(1);
        return byId.toString();
    }

//    @Override
//    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//        System.out.println("属性复制");
//        this.beanFactory = beanFactory;
//    }
}
