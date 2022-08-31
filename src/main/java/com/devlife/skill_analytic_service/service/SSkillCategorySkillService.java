package com.devlife.skill_analytic_service.service;

import com.devlife.skill_analytic_service.dto.SSkillCategorySkillDto;
import com.devlife.skill_analytic_service.entity.SSkillCategorySkill;
import com.devlife.skill_analytic_service.mapper.SSkillCategorySkillMapper;
import com.devlife.skill_analytic_service.repository.SSkillCategorySkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SSkillCategorySkillService {
    private final SSkillCategorySkillRepository sSkillCategorySkillRepository;
    private final SSkillCategorySkillMapper mapper;

    public void addSSkillCategorySkill(SSkillCategorySkillDto sSkillCategorySkillDto) {
        sSkillCategorySkillRepository.save(mapper.convertToEntity(sSkillCategorySkillDto));
    }

    public SSkillCategorySkillDto getSSkillCategorySkill(Long id) {
        SSkillCategorySkill sSkillCategorySkill = sSkillCategorySkillRepository.getById(id);
        return mapper.convertToDto(sSkillCategorySkill);
    }

    public List<SSkillCategorySkillDto> getAllSSkillCategorySkills() {
        List<SSkillCategorySkill> sSkillCategorySkills = sSkillCategorySkillRepository.findAll();
        return sSkillCategorySkills.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }

    public Boolean deleteSSkillCategorySkillById(Long id) {
        sSkillCategorySkillRepository.deleteById(id);
        return !sSkillCategorySkillRepository.existsById(id);
    }
}
