package com.devlife.skill_analytic_service.service;

import com.devlife.skill_analytic_service.dto.SDifficultyDto;
import com.devlife.skill_analytic_service.entity.SDifficulty;
import com.devlife.skill_analytic_service.mapper.SDifficultyMapper;
import com.devlife.skill_analytic_service.repository.SDifficultyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SDifficultyService {
    private final SDifficultyRepository sDifficultyRepository;
    private final SDifficultyMapper mapper;

    public Long addDifficulty(SDifficultyDto sDifficultyDto) {
        SDifficulty saveDifficulty = sDifficultyRepository.save(mapper.convertToEntity(sDifficultyDto));
        if (saveDifficulty != null) {
            return saveDifficulty.getId();
        }
        return null;
    }

    public SDifficultyDto getDifficulty(Long id) {
        SDifficulty sDifficulty = sDifficultyRepository.getById(id);
        return mapper.convertToDto(sDifficulty);
    }

    public List<SDifficultyDto> getAllDifficulties() {
        List<SDifficulty> sDifficulties = sDifficultyRepository.findAll();
        return sDifficulties.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }

    public Boolean deleteDifficultById(Long id) {
        sDifficultyRepository.deleteById(id);
        return !sDifficultyRepository.existsById(id);
    }
}
