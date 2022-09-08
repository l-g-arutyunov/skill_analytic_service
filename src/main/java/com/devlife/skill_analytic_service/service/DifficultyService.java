package com.devlife.skill_analytic_service.service;

import com.devlife.skill_analytic_service.dto.DifficultyDto;
import com.devlife.skill_analytic_service.entity.Difficulty;
import com.devlife.skill_analytic_service.mapper.DifficultyMapper;
import com.devlife.skill_analytic_service.repository.DifficultyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DifficultyService {
    private final DifficultyRepository difficultyRepository;
    private final DifficultyMapper mapper;

    public Long addDifficulty(DifficultyDto difficultyDto) {
        Difficulty saveDifficulty = difficultyRepository.save(mapper.convertToEntity(difficultyDto));
        if (saveDifficulty != null) {
            return saveDifficulty.getId();
        }
        return null;
    }

    public DifficultyDto getDifficulty(Long id) {
        Difficulty difficulty = difficultyRepository.getById(id);
        return mapper.convertToDto(difficulty);
    }

    public List<DifficultyDto> getAllDifficulties() {
        List<Difficulty> sDifficulties = difficultyRepository.findAll();
        return sDifficulties.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }

    public Boolean deleteDifficultById(Long id) {
        difficultyRepository.deleteById(id);
        return !difficultyRepository.existsById(id);
    }
}
