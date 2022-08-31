package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.SSkillCategoryKindDto;
import com.devlife.skill_analytic_service.entity.SSkillCategoryKind;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SSkillCategoryKindMapper {
    private final ModelMapper mapper;

    public SSkillCategoryKind convertToEntity(SSkillCategoryKindDto sSkillCategoryKindDto) {
        return mapper.map(sSkillCategoryKindDto, SSkillCategoryKind.class);
    }

    public SSkillCategoryKindDto convertToDto(SSkillCategoryKind sSkillCategoryKind) {
        return mapper.map(sSkillCategoryKind, SSkillCategoryKindDto.class);
    }
}
