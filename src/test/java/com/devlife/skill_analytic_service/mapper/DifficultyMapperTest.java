package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.DifficultyDto;
import com.devlife.skill_analytic_service.dto.SkillDto;
import com.devlife.skill_analytic_service.entity.Difficulty;
import com.devlife.skill_analytic_service.entity.Skill;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ActiveProfiles("dev")
@DisplayName("Difficulty Mapper Tests")
class DifficultyMapperTest {
    @Autowired
    DifficultyMapper mapper;

    @Test
    @DisplayName("Конвертируем ДТО Difficulty в Энтити")
    void convertToEntityTest_OK() {
        Difficulty referenceDifficulty = new Difficulty();
        referenceDifficulty.setId(1L);
        referenceDifficulty.setName("name");
        referenceDifficulty.setCoefficient(1L);
        referenceDifficulty.setSkill(new Skill());
        DifficultyDto difficultyDto = DifficultyDto.builder()
                .id(1L)
                .name("name")
                .coefficient(1L)
                .skill(new SkillDto())
                .build();
        Difficulty difficulty = mapper.convertToEntity(difficultyDto);
        assertEquals(referenceDifficulty,difficulty);
    }

    @Test
    @DisplayName("Конвертируем Энтити Difficulty в ДТО ")
    void convertToDtoTest_OK() {
        DifficultyDto referenceDifficultyDto = DifficultyDto.builder()
                .id(1L)
                .name("name")
                .coefficient(1L)
                .skill(new SkillDto())
                .build();
        Difficulty difficulty = new Difficulty();
        difficulty.setId(1L);
        difficulty.setName("name");
        difficulty.setCoefficient(1L);
        difficulty.setSkill(new Skill());
        DifficultyDto difficultyDto = mapper.convertToDto(difficulty);
        assertEquals(referenceDifficultyDto,difficultyDto);
    }
}