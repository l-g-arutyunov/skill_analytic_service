package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.SkillDto;
import com.devlife.skill_analytic_service.entity.Skill;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SkillMapper {
    private final ModelMapper mapper;

    public Skill convertToEntity(SkillDto skillDto) {
        return mapper.map(skillDto, Skill.class);
    }

    public SkillDto convertToDto(Skill skill) {
        return mapper.map(skill, SkillDto.class);
    }
}
