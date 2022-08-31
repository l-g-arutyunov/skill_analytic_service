package com.devlife.skill_analytic_service.service;

import com.devlife.skill_analytic_service.dto.SGradeDto;
import com.devlife.skill_analytic_service.entity.SGrade;
import com.devlife.skill_analytic_service.mapper.SGradeMapper;
import com.devlife.skill_analytic_service.repository.SGradeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SGradeService {
    private final SGradeRepository sGradeRepository;
    private final SGradeMapper mapper;

    public Long addGrade(SGradeDto sGradeDto) {
        SGrade saveGrade = sGradeRepository.save(mapper.convertToEntity(sGradeDto));
        if (saveGrade != null) {
            return saveGrade.getId();
        }
        return null;
    }

    public SGradeDto getGrade(Long id) {
        SGrade sGrade = sGradeRepository.getById(id);
        return mapper.convertToDto(sGrade);
    }

    public List<SGradeDto> getAllGrades() {
        List<SGrade> sGrades = sGradeRepository.findAll();
        return sGrades.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }

    public Boolean deleteGradeById(Long id) {
        sGradeRepository.deleteById(id);
        return !sGradeRepository.existsById(id);
    }
}
