package com.devlife.skill_analytic_service.controller.v1;

import com.devlife.skill_analytic_service.dto.SkillCategoryDto;
import com.devlife.skill_analytic_service.service.SkillCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class SkillCategoryController {
    private final SkillCategoryService service;

    @PutMapping("skill_category")
    Long addSkillCategory(@RequestBody SkillCategoryDto skillCategoryDto) {
        return service.addSkillCategory(skillCategoryDto);
    }

    @GetMapping("skill_category/{id}")
    SkillCategoryDto getSkillCategory(@PathVariable("id") Long id) {
        return service.getSkillCategory(id);
    }

    @GetMapping("skill_category")
    List<SkillCategoryDto> getAllSkillCategories() {
        return service.getAllSkillCategories();
    }

    @DeleteMapping("skill_category/{id}")
    Boolean deleteSkillCategoryById(@PathVariable("id") Long id) {
        return service.deleteSkillCategoryById(id);
    }

}
