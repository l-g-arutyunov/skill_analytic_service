package com.devlife.skill_analytic_service.service;

import com.devlife.skill_analytic_service.dto.SSkillCategoryKindDto;
import com.devlife.skill_analytic_service.entity.SSkillCategoryKind;
import com.devlife.skill_analytic_service.mapper.SSkillCategoryKindMapper;
import com.devlife.skill_analytic_service.repository.SSkillCategoryKindRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SSkillCategoryKindService {
    private final SSkillCategoryKindRepository sSkillCategoryKindRepository;
    private final SSkillCategoryKindMapper mapper;

    public Long addSkillCategoryKind(SSkillCategoryKindDto sSkillCategoryKindDto) {
        SSkillCategoryKind saveSSkillCategoryKind = sSkillCategoryKindRepository.save(mapper.convertToEntity(sSkillCategoryKindDto));
        if (saveSSkillCategoryKind != null) {
            return saveSSkillCategoryKind.getId();
        }
        return null;
    }

    public SSkillCategoryKindDto getSkillCategoryKind(Long id) {
        SSkillCategoryKind sSkillCategoryKind = sSkillCategoryKindRepository.getById(id);
        return mapper.convertToDto(sSkillCategoryKind);
    }

    public List<SSkillCategoryKindDto> getAllSkillCategoryKinds() {
        List<SSkillCategoryKind> sSkillCategoryKinds = sSkillCategoryKindRepository.findAll();
        return sSkillCategoryKinds.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }

    public Boolean deleteSkillCategoryKindById(Long id) {
        sSkillCategoryKindRepository.deleteById(id);
        return !sSkillCategoryKindRepository.existsById(id);
    }
}
