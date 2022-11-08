package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.GradeDto;
import com.devlife.skill_analytic_service.entity.Grade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ActiveProfiles("dev")
@DisplayName("Grade Mapper Tests")
class GradeMapperTest {
    @Autowired
    GradeMapper mapper;

    @Test
    @DisplayName("Конвертируем ДТО Grade в Энтити")
    void convertToEntityTest_OK() {
        Grade referenceGrade = new Grade();
        referenceGrade.setId(1L);
        referenceGrade.setName("name");
        referenceGrade.setExperienceValue(1L);
        referenceGrade.setDescription("description");
        GradeDto gradeDto = GradeDto.builder()
                .id(1L)
                .description("description")
                .experienceValue(1L)
                .name("name")
                .build();
        Grade grade = mapper.convertToEntity(gradeDto);
        assertEquals(referenceGrade,grade);
    }

    @Test
    @DisplayName("Конвертируем Энтити Grade в ДТО ")
    void convertToDtoTest_OK() {
        GradeDto referenceGradeDto = GradeDto.builder()
                .id(1L)
                .description("description")
                .experienceValue(1L)
                .name("name")
                .build();
        Grade grade=new Grade();
        grade.setId(1L);
        grade.setName("name");
        grade.setExperienceValue(1L);
        grade.setDescription("description");
        GradeDto gradeDto = mapper.convertToDto(grade);
        assertEquals(referenceGradeDto,gradeDto);
    }
}