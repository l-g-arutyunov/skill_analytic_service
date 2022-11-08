package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.SkillCategoryDto;
import com.devlife.skill_analytic_service.dto.SkillCategoryKindDto;
import com.devlife.skill_analytic_service.dto.SkillCategorySkillDto;
import com.devlife.skill_analytic_service.entity.SkillCategory;
import com.devlife.skill_analytic_service.entity.SkillCategoryKind;
import com.devlife.skill_analytic_service.entity.SkillCategorySkill;
import com.devlife.skill_analytic_service.entity.embeddable.SkillCategorySkillId;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ActiveProfiles("dev")
@DisplayName("SkillCategorySkill Mapper Tests")
class SkillCategorySkillMapperTest {
    @Autowired
    SkillCategorySkillMapper mapper;

    @Test
    @DisplayName("Конвертируем ДТО SkillCategorySkill в Энтити")
    void convertToEntityTest_OK() {
        SkillCategorySkill referenceSkillCategorySkill = new SkillCategorySkill();
        referenceSkillCategorySkill.setSkillCategorySkillId(null);
        SkillCategorySkillDto skillCategorySkillDto = SkillCategorySkillDto.builder().build();
        SkillCategorySkill skillCategorySkill = mapper.convertToEntity(skillCategorySkillDto);
        assertEquals(referenceSkillCategorySkill,skillCategorySkill);
    }

    @Test
    @DisplayName("Конвертируем Энтити SkillCategorySkill в ДТО ")
    void convertToDtoTest_OK() {
        SkillCategorySkillDto referenceSkillCategorySkillDto = SkillCategorySkillDto.builder().build();
        SkillCategorySkill skillCategorySkill = new SkillCategorySkill();
        skillCategorySkill.setSkillCategorySkillId(null);
        SkillCategorySkillDto skillCategorySkillDto = mapper.convertToDto(skillCategorySkill);
        assertEquals(referenceSkillCategorySkillDto,skillCategorySkillDto);
    }
}