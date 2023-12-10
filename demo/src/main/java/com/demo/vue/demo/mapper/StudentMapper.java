package com.demo.vue.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.vue.demo.domain.entity.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author yuanyi
 * @date 2023-12-10 19:55:18
 * 数据库访问层
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}
