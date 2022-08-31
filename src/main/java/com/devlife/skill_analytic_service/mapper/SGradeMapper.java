package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.SGradeDto;
import com.devlife.skill_analytic_service.entity.SGrade;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SGradeMapper {
    private final ModelMapper mapper;

    public SGrade convertToEntity(SGradeDto sGradeDto) {
        return mapper.map(sGradeDto, SGrade.class);
    }

    public SGradeDto convertToDto(SGrade sGrade) {
        return mapper.map(sGrade, SGradeDto.class);
    }
}
