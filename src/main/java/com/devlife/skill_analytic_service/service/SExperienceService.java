package com.devlife.skill_analytic_service.service;

import com.devlife.skill_analytic_service.dto.SExperienceDto;
import com.devlife.skill_analytic_service.entity.SExperience;
import com.devlife.skill_analytic_service.mapper.SExperienceMapper;
import com.devlife.skill_analytic_service.repository.SExperienceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SExperienceService {
    private final SExperienceRepository sExperienceRepository;
    private final SExperienceMapper mapper;

    public Long addExperience(SExperienceDto sExperienceDto) {
        SExperience saveExperience = sExperienceRepository.save(mapper.convertToEntity(sExperienceDto));
        if (saveExperience != null) {
            return saveExperience.getId();
        }
        return null;
    }

    public SExperienceDto getExperience(Long id) {
        SExperience sExperience = sExperienceRepository.getById(id);
        return mapper.convertToDto(sExperience);
    }

    public List<SExperienceDto> getAllExperiences() {
        List<SExperience> sExperiences = sExperienceRepository.findAll();
        return sExperiences.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }

    public Boolean deleteExperienceById(Long id) {
        sExperienceRepository.deleteById(id);
        return !sExperienceRepository.existsById(id);
    }
}
