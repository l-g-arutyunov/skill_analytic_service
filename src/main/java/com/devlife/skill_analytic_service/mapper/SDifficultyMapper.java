package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.SDifficultyDto;
import com.devlife.skill_analytic_service.entity.SDifficulty;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SDifficultyMapper {
    private final ModelMapper mapper;

    public SDifficulty convertToEntity(SDifficultyDto sDifficultyDto) {
        return mapper.map(sDifficultyDto, SDifficulty.class);
    }

    public SDifficultyDto convertToDto(SDifficulty sDifficultyEntity) {
        return mapper.map(sDifficultyEntity,SDifficultyDto.class);
    }
}
