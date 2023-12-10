package com.demo.vue.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo.vue.demo.domain.entity.Student;
import com.demo.vue.demo.mapper.StudentMapper;
import com.demo.vue.demo.service.IStudentService;
import org.springframework.stereotype.Service;

/**
 * @author yuanyi
 * @date 2023-12-10 19:55:18
 * 服务实现类
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
