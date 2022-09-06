package com.devlife.skill_analytic_service.service;

import com.devlife.skill_analytic_service.dto.GradeDto;
import com.devlife.skill_analytic_service.entity.Grade;
import com.devlife.skill_analytic_service.mapper.GradeMapper;
import com.devlife.skill_analytic_service.repository.GradeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GradeService {
    private final GradeRepository gradeRepository;
    private final GradeMapper mapper;

    public Long addGrade(GradeDto gradeDto) {
        Grade saveGrade = gradeRepository.save(mapper.convertToEntity(gradeDto));
        if (saveGrade != null) {
            return saveGrade.getId();
        }
        return null;
    }

    public GradeDto getGrade(Long id) {
        Grade grade = gradeRepository.getById(id);
        return mapper.convertToDto(grade);
    }

    public List<GradeDto> getAllGrades() {
        List<Grade> grades = gradeRepository.findAll();
        return grades.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }

    public Boolean deleteGradeById(Long id) {
        gradeRepository.deleteById(id);
        return !gradeRepository.existsById(id);
    }
}
