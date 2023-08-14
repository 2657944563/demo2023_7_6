package com.example.demo2023_7_6.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo2023_7_6.domain.entity.Student;
import com.example.demo2023_7_6.mapper.StudentMapper;
import com.example.demo2023_7_6.service.IStudentService;
import org.springframework.stereotype.Service;

/**
 * @author yuanyi
 * @date 2023-07-07 15:58:04
 * 服务实现类
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
