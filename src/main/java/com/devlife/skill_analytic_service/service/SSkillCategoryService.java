package com.devlife.skill_analytic_service.service;

import com.devlife.skill_analytic_service.dto.SSkillCategoryDto;
import com.devlife.skill_analytic_service.entity.SSkillCategory;
import com.devlife.skill_analytic_service.mapper.SSkillCategoryMapper;
import com.devlife.skill_analytic_service.repository.SSkillCategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SSkillCategoryService {
    private final SSkillCategoryRepository sSkillCategoryRepository;
    private final SSkillCategoryMapper mapper;

    public Long addSkillCategory(SSkillCategoryDto sSkillCategoryDto) {
        SSkillCategory saveSkillCategory = sSkillCategoryRepository.save(mapper.convertToEntity(sSkillCategoryDto));
        if (saveSkillCategory != null) {
            return saveSkillCategory.getId();
        }
        return null;
    }

    public SSkillCategoryDto getSkillCategory(Long id) {
        SSkillCategory sSkillCategory = sSkillCategoryRepository.getById(id);
        return mapper.convertToDto(sSkillCategory);
    }

    public List<SSkillCategoryDto> getAllSkillCategories() {
        List<SSkillCategory> sSkillCategories = sSkillCategoryRepository.findAll();
        return sSkillCategories.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }

    public Boolean deleteSkillCategoryById(Long id) {
        sSkillCategoryRepository.deleteById(id);
        return !sSkillCategoryRepository.existsById(id);
    }
}
