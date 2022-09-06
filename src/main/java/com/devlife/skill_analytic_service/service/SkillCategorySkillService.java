package com.devlife.skill_analytic_service.service;

import com.devlife.skill_analytic_service.dto.SkillCategorySkillDto;
import com.devlife.skill_analytic_service.entity.SkillCategorySkill;
import com.devlife.skill_analytic_service.mapper.SkillCategorySkillMapper;
import com.devlife.skill_analytic_service.repository.SkillCategorySkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SkillCategorySkillService {
    private final SkillCategorySkillRepository skillCategorySkillRepository;
    private final SkillCategorySkillMapper mapper;

    public void addSSkillCategorySkill(SkillCategorySkillDto skillCategorySkillDto) {
        skillCategorySkillRepository.save(mapper.convertToEntity(skillCategorySkillDto));
    }

    public SkillCategorySkillDto getSSkillCategorySkill(Long id) {
        SkillCategorySkill skillCategorySkill = skillCategorySkillRepository.getById(id);
        return mapper.convertToDto(skillCategorySkill);
    }

    public List<SkillCategorySkillDto> getAllSSkillCategorySkills() {
        List<SkillCategorySkill> skillCategorySkills = skillCategorySkillRepository.findAll();
        return skillCategorySkills.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }

    public Boolean deleteSSkillCategorySkillById(Long id) {
        skillCategorySkillRepository.deleteById(id);
        return !skillCategorySkillRepository.existsById(id);
    }
}
