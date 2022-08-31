package com.devlife.skill_analytic_service.controller.v1;

import com.devlife.skill_analytic_service.dto.SSkillDto;
import com.devlife.skill_analytic_service.service.SSkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class SSkillController {
    private final SSkillService service;

    @PutMapping("skill")
    Long addSkill(@RequestBody SSkillDto sSkillDto) {
        return service.addSkill(sSkillDto);
    }

    @GetMapping("skill/{id}")
    SSkillDto getSkill(@PathVariable("id") Long id) {
        return (service.getSkill(id));
    }

    @GetMapping("skill")
    List<SSkillDto> getAllSkills() {
        return service.getAllSkills();
    }

    @DeleteMapping("skill/{id}")
    Boolean deleteSkillById(@PathVariable("id") Long id) {
        return service.deleteSkillById(id);
    }

}
