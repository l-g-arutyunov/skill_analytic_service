package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.GradeDto;
import com.devlife.skill_analytic_service.dto.SkillDto;
import com.devlife.skill_analytic_service.dto.UserDto;
import com.devlife.skill_analytic_service.dto.UserSkillDto;
import com.devlife.skill_analytic_service.entity.Grade;
import com.devlife.skill_analytic_service.entity.Skill;
import com.devlife.skill_analytic_service.entity.User;
import com.devlife.skill_analytic_service.entity.UserSkill;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ActiveProfiles("dev")
@DisplayName("UserSkill Mapper Tests")
class UserSkillMapperTest {
    @Autowired
    UserSkillMapper mapper;

    @Test
    @DisplayName("Конвертируем ДТО UserSkill в Энтити")
    void convertToEntity() {
        UserSkill referenceUserSkill = new UserSkill();
        referenceUserSkill.setId(1L);
        referenceUserSkill.setUser(new User());
        referenceUserSkill.setSkill(new Skill());
        referenceUserSkill.setGrade(new Grade());
        referenceUserSkill.setLevel(1L);
        referenceUserSkill.setAcquireData(LocalDate.EPOCH);
        UserSkillDto userSkillDto = UserSkillDto.builder().id(1L)
                .skill(new SkillDto()).user(new UserDto()).grade(new GradeDto())
                .acquireData(LocalDate.EPOCH).level(1L).build();
        UserSkill userSkill = mapper.convertToEntity(userSkillDto);
        assertEquals(referenceUserSkill,userSkill);
    }

    @Test
    @DisplayName("Конвертируем Энтити UserSkill в ДТО ")
    void convertToDto() {
        UserSkillDto referenceUserSkillDto = UserSkillDto.builder().id(1L)
                .skill(new SkillDto()).user(new UserDto()).grade(new GradeDto())
                .acquireData(LocalDate.EPOCH).level(1L).build();
        UserSkill userSkill = new UserSkill();
        userSkill.setId(1L);
        userSkill.setUser(new User());
        userSkill.setSkill(new Skill());
        userSkill.setGrade(new Grade());
        userSkill.setLevel(1L);
        userSkill.setAcquireData(LocalDate.EPOCH);
        UserSkillDto userSkillDto = mapper.convertToDto(userSkill);
        assertEquals(referenceUserSkillDto,userSkillDto);
    }
}