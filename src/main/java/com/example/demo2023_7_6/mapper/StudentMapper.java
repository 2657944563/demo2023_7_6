package com.example.demo2023_7_6.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import com.example.demo2023_7_6.domain.entity.Student;

/**
 * @author yuanyi
 * @date 2023-07-07 15:58:04
 * 数据库访问层
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}
