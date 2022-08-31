package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.SSkillDto;
import com.devlife.skill_analytic_service.entity.SSkill;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SSkillMapper {
    private final ModelMapper mapper;

    public SSkill convertToEntity(SSkillDto sSkillDto) {
        return mapper.map(sSkillDto, SSkill.class);
    }

    public SSkillDto convertToDto(SSkill sSkill) {
        return mapper.map(sSkill, SSkillDto.class);
    }
}
