package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.SkillCategoryKindDto;
import com.devlife.skill_analytic_service.entity.SkillCategoryKind;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ActiveProfiles("dev")
@DisplayName("Skill Category Kind Mapper Tests")
class SkillCategoryKindMapperTest {
    @Autowired
    SkillCategoryKindMapper mapper;

    @Test
    @DisplayName("Конвертируем ДТО SkillCategoryKind в Энтити")
    void convertToEntityTest_OK() {
        SkillCategoryKind referenceSkillCategoryKind = new SkillCategoryKind();
        referenceSkillCategoryKind.setId(1L);
        referenceSkillCategoryKind.setName("name");
        referenceSkillCategoryKind.setDescription("description");
        SkillCategoryKindDto skillCategoryKindDto = SkillCategoryKindDto.builder()
                .id(1L)
                .name("name")
                .description("description")
                .build();
        SkillCategoryKind skillCategoryKind = mapper.convertToEntity(skillCategoryKindDto);
        assertEquals(referenceSkillCategoryKind,skillCategoryKind);
    }

    @Test
    @DisplayName("Конвертируем Энтити SkillCategoryKind в ДТО ")
    void convertToDtoTest_OK() {
        SkillCategoryKindDto referenceSkillCategoryKindDto = SkillCategoryKindDto.builder()
                .id(1L)
                .name("name")
                .description("description")
                .build();
        SkillCategoryKind skillCategoryKind = new SkillCategoryKind();
        skillCategoryKind.setId(1L);
        skillCategoryKind.setName("name");
        skillCategoryKind.setDescription("description");
        SkillCategoryKindDto skillCategoryKindDto = mapper.convertToDto(skillCategoryKind);
        assertEquals(referenceSkillCategoryKindDto,skillCategoryKindDto);
    }
}