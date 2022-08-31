package com.devlife.skill_analytic_service.controller.v1;

import com.devlife.skill_analytic_service.dto.SSkillCategorySkillDto;
import com.devlife.skill_analytic_service.service.SSkillCategorySkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class SSkillCategorySkillController {
    private final SSkillCategorySkillService service;

    @PostMapping("addSSkillCategorySkill")
    void addSSkillCategorySkill(@RequestBody SSkillCategorySkillDto sSkillCategorySkillDto) {
        service.addSSkillCategorySkill(sSkillCategorySkillDto);
    }
    @GetMapping("sSkillCategorySkill/{id}")
    SSkillCategorySkillDto getSSkillCategorySkill(@PathVariable("id") Long id) {
        return service.getSSkillCategorySkill(id);
    }

    @GetMapping("sSkillCategorySkill")
    List<SSkillCategorySkillDto> getAllSSkillCategorySkills() {
        return service.getAllSSkillCategorySkills();
    }

    @DeleteMapping("sSkillCategorySkill/{id}")
    Boolean deleteSSkillCategorySkillById(@PathVariable("id") Long id) {
        return service.deleteSSkillCategorySkillById(id);
    }

}
