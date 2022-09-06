package com.devlife.skill_analytic_service.service;

import com.devlife.skill_analytic_service.dto.SkillCategoryKindDto;
import com.devlife.skill_analytic_service.entity.SkillCategoryKind;
import com.devlife.skill_analytic_service.mapper.SkillCategoryKindMapper;
import com.devlife.skill_analytic_service.repository.SkillCategoryKindRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SkillCategoryKindService {
    private final SkillCategoryKindRepository skillCategoryKindRepository;
    private final SkillCategoryKindMapper mapper;

    public Long addSkillCategoryKind(SkillCategoryKindDto skillCategoryKindDto) {
        SkillCategoryKind saveSkillCategoryKind = skillCategoryKindRepository.save(mapper.convertToEntity(skillCategoryKindDto));
        if (saveSkillCategoryKind != null) {
            return saveSkillCategoryKind.getId();
        }
        return null;
    }

    public SkillCategoryKindDto getSkillCategoryKind(Long id) {
        SkillCategoryKind skillCategoryKind = skillCategoryKindRepository.getById(id);
        return mapper.convertToDto(skillCategoryKind);
    }

    public List<SkillCategoryKindDto> getAllSkillCategoryKinds() {
        List<SkillCategoryKind> skillCategoryKinds = skillCategoryKindRepository.findAll();
        return skillCategoryKinds.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }

    public Boolean deleteSkillCategoryKindById(Long id) {
        skillCategoryKindRepository.deleteById(id);
        return !skillCategoryKindRepository.existsById(id);
    }
}
