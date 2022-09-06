package com.devlife.skill_analytic_service.service;

import com.devlife.skill_analytic_service.dto.SkillCategoryDto;
import com.devlife.skill_analytic_service.entity.SkillCategory;
import com.devlife.skill_analytic_service.mapper.SkillCategoryMapper;
import com.devlife.skill_analytic_service.repository.SkillCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SkillCategoryService {
    private final SkillCategoryRepository skillCategoryRepository;
    private final SkillCategoryMapper mapper;

    public Long addSkillCategory(SkillCategoryDto skillCategoryDto) {
        SkillCategory saveSkillCategory = skillCategoryRepository.save(mapper.convertToEntity(skillCategoryDto));
        if (saveSkillCategory != null) {
            return saveSkillCategory.getId();
        }
        return null;
    }

    public SkillCategoryDto getSkillCategory(Long id) {
        SkillCategory skillCategory = skillCategoryRepository.getById(id);
        return mapper.convertToDto(skillCategory);
    }

    public List<SkillCategoryDto> getAllSkillCategories() {
        List<SkillCategory> sSkillCategories = skillCategoryRepository.findAll();
        return sSkillCategories.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }

    public Boolean deleteSkillCategoryById(Long id) {
        skillCategoryRepository.deleteById(id);
        return !skillCategoryRepository.existsById(id);
    }
}
