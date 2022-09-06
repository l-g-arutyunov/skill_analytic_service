package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.DifficultyDto;
import com.devlife.skill_analytic_service.entity.Difficulty;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DifficultyMapper {
    private final ModelMapper mapper;

    public Difficulty convertToEntity(DifficultyDto difficultyDto) {
        return mapper.map(difficultyDto, Difficulty.class);
    }

    public DifficultyDto convertToDto(Difficulty difficultyEntity) {
        return mapper.map(difficultyEntity, DifficultyDto.class);
    }
}
