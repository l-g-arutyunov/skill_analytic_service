package com.devlife.skill_analytic_service.service;

import com.devlife.skill_analytic_service.dto.ExperienceDto;
import com.devlife.skill_analytic_service.entity.Experience;
import com.devlife.skill_analytic_service.mapper.ExperienceMapper;
import com.devlife.skill_analytic_service.repository.ExperienceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ExperienceService {
    private final ExperienceRepository experienceRepository;
    private final ExperienceMapper mapper;

    public Long addExperience(ExperienceDto experienceDto) {
        Experience saveExperience = experienceRepository.save(mapper.convertToEntity(experienceDto));
        if (saveExperience != null) {
            return saveExperience.getId();
        }
        return null;
    }

    public ExperienceDto getExperience(Long id) {
        Experience experience = experienceRepository.getById(id);
        return mapper.convertToDto(experience);
    }

    public List<ExperienceDto> getAllExperiences() {
        List<Experience> experiences = experienceRepository.findAll();
        return experiences.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }

    public Boolean deleteExperienceById(Long id) {
        experienceRepository.deleteById(id);
        return !experienceRepository.existsById(id);
    }
}
