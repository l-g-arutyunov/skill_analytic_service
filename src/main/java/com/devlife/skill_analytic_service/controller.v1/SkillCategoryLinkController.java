package com.devlife.skill_analytic_service.controller.v1;

import com.devlife.skill_analytic_service.dto.SkillCategoryLinkDto;
import com.devlife.skill_analytic_service.service.SkillCategoryLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class SkillCategoryLinkController {
    private final SkillCategoryLinkService service;

    @PostMapping("addSSkillCategorySkill")
    void addSSkillCategorySkill(@RequestBody SkillCategoryLinkDto skillCategoryLinkDto) {
        service.addSSkillCategorySkill(skillCategoryLinkDto);
    }
    @GetMapping("sSkillCategorySkill/{id}")
    SkillCategoryLinkDto getSSkillCategorySkill(@PathVariable("id") Long id) {
        return service.getSSkillCategorySkill(id);
    }

    @GetMapping("sSkillCategorySkill")
    List<SkillCategoryLinkDto> getAllSSkillCategorySkills() {
        return service.getAllSSkillCategorySkills();
    }

    @DeleteMapping("sSkillCategorySkill/{id}")
    Boolean deleteSSkillCategorySkillById(@PathVariable("id") Long id) {
        return service.deleteSSkillCategorySkillById(id);
    }

}
