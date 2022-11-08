package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.ExperienceDto;
import com.devlife.skill_analytic_service.dto.UserSkillDto;
import com.devlife.skill_analytic_service.entity.Experience;
import com.devlife.skill_analytic_service.entity.UserSkill;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ActiveProfiles("dev")
@DisplayName("Experience Mapper Tests")
class ExperienceMapperTest {
    @Autowired
    ExperienceMapper mapper;

    @Test
    @DisplayName("Конвертируем ДТО Experience в Энтити")
    void convertToEntityTest_OK() {
        Experience referenceExperience = new Experience();
        referenceExperience.setId(1L);
        referenceExperience.setValueExp(1L);
        referenceExperience.setUserSkill(new UserSkill());
        ExperienceDto experienceDto = ExperienceDto.builder()
                .id(1L)
                .valueExp(1L)
                .userSkill(new UserSkillDto())
                .build();
        Experience experience = mapper.convertToEntity(experienceDto);
        assertEquals(referenceExperience,experience);
    }

    @Test
    @DisplayName("Конвертируем Энтити Experience в ДТО ")
    void convertToDtoTest_OK() {
        ExperienceDto referenceExperienceDto = ExperienceDto.builder()
                .id(1L)
                .valueExp(1L)
                .userSkill(new UserSkillDto())
                .build();
        Experience experience = new Experience();
        experience.setId(1L);
        experience.setValueExp(1L);
        experience.setUserSkill(new UserSkill());
        ExperienceDto experienceDto = mapper.convertToDto(experience);
        assertEquals(referenceExperienceDto,experienceDto);
    }
}