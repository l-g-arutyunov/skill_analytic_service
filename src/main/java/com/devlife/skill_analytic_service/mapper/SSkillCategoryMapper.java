package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.SSkillCategoryDto;
import com.devlife.skill_analytic_service.entity.SSkillCategory;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SSkillCategoryMapper {
    private final ModelMapper mapper;

    public SSkillCategory convertToEntity(SSkillCategoryDto sSkillCategoryDto) {
        return mapper.map(sSkillCategoryDto, SSkillCategory.class);
    }

    public SSkillCategoryDto convertToDto(SSkillCategory sSkillCategorys) {
        return mapper.map(sSkillCategorys, SSkillCategoryDto.class);
    }
}
