package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.SkillCategoryDto;
import com.devlife.skill_analytic_service.entity.SkillCategory;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SkillCategoryMapper {
    private final ModelMapper mapper;

    public SkillCategory convertToEntity(SkillCategoryDto skillCategoryDto) {
        return mapper.map(skillCategoryDto, SkillCategory.class);
    }

    public SkillCategoryDto convertToDto(SkillCategory skillCategorys) {
        return mapper.map(skillCategorys, SkillCategoryDto.class);
    }
}
