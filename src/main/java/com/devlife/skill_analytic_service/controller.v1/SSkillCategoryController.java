package com.devlife.skill_analytic_service.controller.v1;

import com.devlife.skill_analytic_service.dto.SSkillCategoryDto;
import com.devlife.skill_analytic_service.service.SSkillCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class SSkillCategoryController {
    private final SSkillCategoryService service;

    @PutMapping("skill_category")
    Long addSkillCategory(@RequestBody SSkillCategoryDto sSkillCategoryDto) {
        return service.addSkillCategory(sSkillCategoryDto);
    }

    @GetMapping("skill_category/{id}")
    SSkillCategoryDto getSkillCategory(@PathVariable("id") Long id) {
        return (service.getSkillCategory(id));
    }

    @GetMapping("skill_category")
    List<SSkillCategoryDto> getAllSkillCategories() {
        return service.getAllSkillCategories();
    }

    @DeleteMapping("skill_category/{id}")
    Boolean deleteSkillCategoryById(@PathVariable("id") Long id) {
        return service.deleteSkillCategoryById(id);
    }

}
