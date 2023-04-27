package com.devlife.skill_analytic_service.service;

import com.devlife.skill_analytic_service.dto.SkillCategoryLinkDto;
import com.devlife.skill_analytic_service.entity.SkillCategoryLink;
import com.devlife.skill_analytic_service.mapper.SkillCategoryLinkMapper;
import com.devlife.skill_analytic_service.repository.SkillCategoryLinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SkillCategoryLinkService {
    private final SkillCategoryLinkRepository skillCategoryLinkRepository;
    private final SkillCategoryLinkMapper mapper;

    public void addSSkillCategorySkill(SkillCategoryLinkDto skillCategoryLinkDto) {
        skillCategoryLinkRepository.save(mapper.convertToEntity(skillCategoryLinkDto));
    }

    public SkillCategoryLinkDto getSSkillCategorySkill(Long id) {
        SkillCategoryLink skillCategoryLink = skillCategoryLinkRepository.getById(id);
        return mapper.convertToDto(skillCategoryLink);
    }

    public List<SkillCategoryLinkDto> getAllSSkillCategorySkills() {
        List<SkillCategoryLink> skillCategoryLinks = skillCategoryLinkRepository.findAll();
        return skillCategoryLinks.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }

    public Boolean deleteSSkillCategorySkillById(Long id) {
        skillCategoryLinkRepository.deleteById(id);
        return !skillCategoryLinkRepository.existsById(id);
    }
}
