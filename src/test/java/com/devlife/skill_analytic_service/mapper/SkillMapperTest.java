package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.SkillDto;
import com.devlife.skill_analytic_service.entity.Skill;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ActiveProfiles("dev")
@DisplayName("Skill Mapper Tests")
class SkillMapperTest {
    @Autowired
    SkillMapper mapper;

    @Test
    @DisplayName("Конвертируем ДТО Skill в Энтити")
    void convertToEntityTest_OK() {
        Skill referenceSkill = new Skill();
        referenceSkill.setId(1L);
        referenceSkill.setName("name");
        referenceSkill.setDescription("description");
        referenceSkill.setParentId(1L);
        SkillDto skillDto = SkillDto.builder()
                .id(1L)
                .name("name")
                .description("description")
                .parentId(1L)
                .build();
        Skill skill = mapper.convertToEntity(skillDto);
        assertEquals(referenceSkill,skill);
    }

    @Test
    @DisplayName("Конвертируем ДТО Skill в Энтити")
    void convertToDtoTest_OK() {
        SkillDto referenceSkillDto = SkillDto.builder()
                .id(1L)
                .name("name")
                .description("description")
                .parentId(1L)
                .build();
        Skill skill = new Skill();
        skill.setId(1L);
        skill.setName("name");
        skill.setDescription("description");
        skill.setParentId(1L);
        SkillDto skillDto = mapper.convertToDto(skill);
        assertEquals(referenceSkillDto,skillDto);
    }
}