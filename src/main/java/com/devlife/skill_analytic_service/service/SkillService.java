package com.devlife.skill_analytic_service.service;

import com.devlife.skill_analytic_service.dto.SkillDto;
import com.devlife.skill_analytic_service.entity.Skill;
import com.devlife.skill_analytic_service.mapper.SkillMapper;
import com.devlife.skill_analytic_service.repository.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SkillService {
    private final SkillRepository skillRepository;
    private final SkillMapper mapper;

    public Long addSkill(SkillDto skillDto) {
        Skill saveSkill = skillRepository.save(mapper.convertToEntity(skillDto));
        if (saveSkill != null) {
            return saveSkill.getId();
        }
        return null;
    }

    public SkillDto getSkill(Long id) {
        Skill skill = skillRepository.getById(id);
        return mapper.convertToDto(skill);
    }

    public List<SkillDto> getAllSkills() {
        List<Skill> skillList = skillRepository.findAll();
        return skillList.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }

    public Boolean deleteSkillById(Long id) {
        skillRepository.deleteById(id);
        return !skillRepository.existsById(id);
    }
}
