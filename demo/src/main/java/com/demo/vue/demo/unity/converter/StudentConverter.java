package com.demo.vue.demo.unity.converter;

import com.demo.vue.demo.domain.DTO.StudentDTO;
import com.demo.vue.demo.domain.entity.Student;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author 呙启伟
 * @date 2023/12/10 20:49
 */
@Mapper
public interface StudentConverter {
    StudentConverter INSTANCE = Mappers.getMapper(StudentConverter.class);

    Student dtoToEntity(StudentDTO dto);

    List<Student> dtosToEntitys(List<StudentDTO> dto);

    StudentDTO entityToDto(Student entity);

    List<StudentDTO> entitysToDtos(List<Student> entity);


}
