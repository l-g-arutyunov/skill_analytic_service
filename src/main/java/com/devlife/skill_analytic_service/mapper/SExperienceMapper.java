package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.SExperienceDto;
import com.devlife.skill_analytic_service.entity.SExperience;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SExperienceMapper {
    private final ModelMapper mapper;

    public SExperience convertToEntity(SExperienceDto sExperienceDto) {
        return mapper.map(sExperienceDto, SExperience.class);
    }

    public SExperienceDto convertToDto(SExperience sExperience) {
        return mapper.map(sExperience, SExperienceDto.class);
    }
}
