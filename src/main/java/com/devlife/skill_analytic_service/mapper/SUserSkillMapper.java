package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.SUserSkillDto;
import com.devlife.skill_analytic_service.entity.SUserSkill;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SUserSkillMapper {
    private final ModelMapper mapper;

    public SUserSkill convertToEntity(SUserSkillDto sUserSkillDto) {
        return mapper.map(sUserSkillDto, SUserSkill.class);
    }

    public SUserSkillDto convertToDto(SUserSkill sUserSkill) {
        return mapper.map(sUserSkill, SUserSkillDto.class);
    }
}
