package com.demo.vue.demo.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.demo.vue.demo.domain.DTO.StudentDTO;
import com.demo.vue.demo.domain.entity.Student;
import com.demo.vue.demo.service.IStudentService;
import com.demo.vue.demo.unity.converter.StudentConverter;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author yuanyi
 * @date 2023-12-10 19:55:16
 * 控制层
 */
@Slf4j
@RestController
@RequestMapping("/student")
@AllArgsConstructor
@Api(tags = "学生信息")
public class StudentController {

    private final IStudentService studentService;

    @ApiOperation("获取学生列表")
    @GetMapping("getList")
    public List<Student> list() {
        LambdaQueryWrapper<Student> gt = Wrappers.<Student>lambdaQuery().gt(Student::getAge, 0);
        List<Student> list = studentService.list(gt);
        return list;
    }

    @ApiOperation("添加学生")
    @PostMapping("insertStudent")
    public boolean insertStudent(@RequestBody List<StudentDTO> list) {
        return studentService.saveBatch(StudentConverter.INSTANCE.dtosToEntitys(list));
    }

    @ApiOperation("获取学生 by id")
    @GetMapping("get/{id}")
    public StudentDTO getStudent(@PathVariable int id) {
        Student s = studentService.getById(id);
        return StudentConverter.INSTANCE.entityToDto(s);
    }
}
