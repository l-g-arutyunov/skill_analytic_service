package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.ExperienceDto;
import com.devlife.skill_analytic_service.entity.Experience;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ExperienceMapper {
    private final ModelMapper mapper;

    public Experience convertToEntity(ExperienceDto experienceDto) {
        return mapper.map(experienceDto, Experience.class);
    }

    public ExperienceDto convertToDto(Experience experience) {
        return mapper.map(experience, ExperienceDto.class);
    }
}
