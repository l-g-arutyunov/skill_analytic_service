package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.SkillCategoryDto;
import com.devlife.skill_analytic_service.dto.SkillCategoryKindDto;
import com.devlife.skill_analytic_service.entity.SkillCategory;
import com.devlife.skill_analytic_service.entity.SkillCategoryKind;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ActiveProfiles("dev")
@DisplayName("SkillCategory Mapper Tests")
class SkillCategoryMapperTest {
    @Autowired
    SkillCategoryMapper mapper;

    @Test
    @DisplayName("Конвертируем ДТО SkillCategory в Энтити")
    void convertToEntity() {
        SkillCategory referenceSkillCategory = new SkillCategory();
        referenceSkillCategory.setId(1L);
        referenceSkillCategory.setName("name");
        referenceSkillCategory.setSkillCategoryKind(new SkillCategoryKind());
        SkillCategoryDto skillCategoryDto = SkillCategoryDto.builder().id(1L)
                .name("name").skillCategoryKind(new SkillCategoryKindDto()).build();
        SkillCategory skillCategory = mapper.convertToEntity(skillCategoryDto);
        assertEquals(referenceSkillCategory,skillCategory);
    }

    @Test
    @DisplayName("Конвертируем Энтити SkillCategory в ДТО ")
    void convertToDto() {
        SkillCategoryDto referenceSkillCategoryDto = SkillCategoryDto.builder().id(1L)
                .name("name").skillCategoryKind(new SkillCategoryKindDto()).build();
        SkillCategory skillCategory = new SkillCategory();
        skillCategory.setId(1L);
        skillCategory.setName("name");
        skillCategory.setSkillCategoryKind(new SkillCategoryKind());
        SkillCategoryDto skillCategoryDto = mapper.convertToDto(skillCategory);
        assertEquals(referenceSkillCategoryDto,skillCategoryDto);
    }
}