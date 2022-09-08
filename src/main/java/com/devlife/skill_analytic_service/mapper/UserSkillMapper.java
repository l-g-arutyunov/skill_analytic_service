package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.UserSkillDto;
import com.devlife.skill_analytic_service.entity.UserSkill;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserSkillMapper {
    private final ModelMapper mapper;

    public UserSkill convertToEntity(UserSkillDto userSkillDto) {
        return mapper.map(userSkillDto, UserSkill.class);
    }

    public UserSkillDto convertToDto(UserSkill userSkill) {
        return mapper.map(userSkill, UserSkillDto.class);
    }
}
