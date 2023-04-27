package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.SkillCategoryLinkDto;
import com.devlife.skill_analytic_service.entity.SkillCategoryLink;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ActiveProfiles("dev")
@DisplayName("SkillCategoryLink Mapper Tests")
class SkillCategoryLinkMapperTest {
    @Autowired
    SkillCategoryLinkMapper mapper;

    @Test
    @DisplayName("Конвертируем ДТО SkillCategoryLink в Энтити")
    void convertToEntityTest_OK() {
        SkillCategoryLink referenceSkillCategoryLink = new SkillCategoryLink();
        referenceSkillCategoryLink.setSkillCategorySkillId(null);
        SkillCategoryLinkDto skillCategoryLinkDto = SkillCategoryLinkDto.builder().build();
        SkillCategoryLink skillCategoryLink = mapper.convertToEntity(skillCategoryLinkDto);
        assertEquals(referenceSkillCategoryLink, skillCategoryLink);
    }

    @Test
    @DisplayName("Конвертируем Энтити SkillCategoryLink в ДТО ")
    void convertToDtoTest_OK() {
        SkillCategoryLinkDto referenceSkillCategoryLinkDto = SkillCategoryLinkDto.builder().build();
        SkillCategoryLink skillCategoryLink = new SkillCategoryLink();
        skillCategoryLink.setSkillCategorySkillId(null);
        SkillCategoryLinkDto skillCategoryLinkDto = mapper.convertToDto(skillCategoryLink);
        assertEquals(referenceSkillCategoryLinkDto, skillCategoryLinkDto);
    }
}