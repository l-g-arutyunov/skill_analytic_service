package com.devlife.skill_analytic_service.controller.v1;

import com.devlife.skill_analytic_service.dto.SkillCategorySkillDto;
import com.devlife.skill_analytic_service.service.SkillCategorySkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class SkillCategorySkillController {
    private final SkillCategorySkillService service;

    @PostMapping("addSSkillCategorySkill")
    void addSSkillCategorySkill(@RequestBody SkillCategorySkillDto skillCategorySkillDto) {
        service.addSSkillCategorySkill(skillCategorySkillDto);
    }
    @GetMapping("sSkillCategorySkill/{id}")
    SkillCategorySkillDto getSSkillCategorySkill(@PathVariable("id") Long id) {
        return service.getSSkillCategorySkill(id);
    }

    @GetMapping("sSkillCategorySkill")
    List<SkillCategorySkillDto> getAllSSkillCategorySkills() {
        return service.getAllSSkillCategorySkills();
    }

    @DeleteMapping("sSkillCategorySkill/{id}")
    Boolean deleteSSkillCategorySkillById(@PathVariable("id") Long id) {
        return service.deleteSSkillCategorySkillById(id);
    }

}
