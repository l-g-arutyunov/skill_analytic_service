package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.SkillCategoryKindDto;
import com.devlife.skill_analytic_service.entity.SkillCategoryKind;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SkillCategoryKindMapper {
    private final ModelMapper mapper;

    public SkillCategoryKind convertToEntity(SkillCategoryKindDto skillCategoryKindDto) {
        return mapper.map(skillCategoryKindDto, SkillCategoryKind.class);
    }

    public SkillCategoryKindDto convertToDto(SkillCategoryKind skillCategoryKind) {
        return mapper.map(skillCategoryKind, SkillCategoryKindDto.class);
    }
}
