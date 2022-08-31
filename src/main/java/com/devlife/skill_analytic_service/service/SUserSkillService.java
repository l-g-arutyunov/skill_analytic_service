package com.devlife.skill_analytic_service.service;

import com.devlife.skill_analytic_service.dto.SUserSkillDto;
import com.devlife.skill_analytic_service.entity.SUserSkill;
import com.devlife.skill_analytic_service.mapper.SUserSkillMapper;
import com.devlife.skill_analytic_service.repository.SUserSkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SUserSkillService {
    private final SUserSkillRepository sUserSkillRepository;
    private final SUserSkillMapper mapper;

    public Long addUserSkill(SUserSkillDto sUserSkillDto) {
        SUserSkill saveUserSkill = sUserSkillRepository.save(mapper.convertToEntity(sUserSkillDto));
        if (saveUserSkill != null) {
            return saveUserSkill.getId();
        }
        return null;
    }

    public SUserSkillDto getUserSkill(Long id) {
        SUserSkill sUserSkill = sUserSkillRepository.getById(id);
        return mapper.convertToDto(sUserSkill);
    }

    public List<SUserSkillDto> getAllUserSkills() {
        List<SUserSkill> sUserSkills = sUserSkillRepository.findAll();
        return sUserSkills.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }

    public Boolean deleteUserSkillById(Long id) {
        sUserSkillRepository.deleteById(id);
        return !sUserSkillRepository.existsById(id);
    }
}
