package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.GradeDto;
import com.devlife.skill_analytic_service.entity.Grade;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class GradeMapper {
    private final ModelMapper mapper;

    public Grade convertToEntity(GradeDto gradeDto) {
        return mapper.map(gradeDto, Grade.class);
    }

    public GradeDto convertToDto(Grade grade) {
        return mapper.map(grade, GradeDto.class);
    }
}
