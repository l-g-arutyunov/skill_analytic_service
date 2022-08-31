package com.devlife.skill_analytic_service.service;

import com.devlife.skill_analytic_service.dto.SSkillDto;
import com.devlife.skill_analytic_service.entity.SSkill;
import com.devlife.skill_analytic_service.mapper.SSkillMapper;
import com.devlife.skill_analytic_service.repository.SSkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SSkillService {
    private final SSkillRepository sSkillRepository;
    private final SSkillMapper mapper;

    public Long addSkill(SSkillDto sSkillDto) {
        SSkill saveSkill = sSkillRepository.save(mapper.convertToEntity(sSkillDto));
        if (saveSkill != null) {
            return saveSkill.getId();
        }
        return null;
    }

    public SSkillDto getSkill(Long id) {
        SSkill sSkill = sSkillRepository.getById(id);
        return mapper.convertToDto(sSkill);
    }

    public List<SSkillDto> getAllSkills() {
        List<SSkill> skillList = sSkillRepository.findAll();
        return skillList.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }

    public Boolean deleteSkillById(Long id) {
        sSkillRepository.deleteById(id);
        return !sSkillRepository.existsById(id);
    }
}
