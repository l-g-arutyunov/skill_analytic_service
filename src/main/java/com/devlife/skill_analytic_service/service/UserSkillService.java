package com.devlife.skill_analytic_service.service;

import com.devlife.skill_analytic_service.dto.UserSkillDto;
import com.devlife.skill_analytic_service.entity.UserSkill;
import com.devlife.skill_analytic_service.mapper.UserSkillMapper;
import com.devlife.skill_analytic_service.repository.UserSkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserSkillService {
    private final UserSkillRepository userSkillRepository;
    private final UserSkillMapper mapper;

    public Long addUserSkill(UserSkillDto userSkillDto) {
        UserSkill saveUserSkill = userSkillRepository.save(mapper.convertToEntity(userSkillDto));
        if (saveUserSkill != null) {
            return saveUserSkill.getId();
        }
        return null;
    }

    public UserSkillDto getUserSkill(Long id) {
        UserSkill userSkill = userSkillRepository.getById(id);
        return mapper.convertToDto(userSkill);
    }

    public List<UserSkillDto> getAllUserSkills() {
        List<UserSkill> userSkills = userSkillRepository.findAll();
        return userSkills.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }

    public Boolean deleteUserSkillById(Long id) {
        userSkillRepository.deleteById(id);
        return !userSkillRepository.existsById(id);
    }
}
