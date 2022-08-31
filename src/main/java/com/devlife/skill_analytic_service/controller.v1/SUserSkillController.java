package com.devlife.skill_analytic_service.controller.v1;

import com.devlife.skill_analytic_service.dto.SUserSkillDto;
import com.devlife.skill_analytic_service.service.SUserSkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class SUserSkillController {
    private final SUserSkillService service;

    @PutMapping("user_skill")
    Long addUserSkill(@RequestBody SUserSkillDto sUserSkillDto) {
        return service.addUserSkill(sUserSkillDto);
    }

    @GetMapping("user_skill/{id}")
    SUserSkillDto getUserSkill(@PathVariable("id") Long id) {
        return (service.getUserSkill(id));
    }

    @GetMapping("user_skill")
    List<SUserSkillDto> getAllUserSkills() {
        return service.getAllUserSkills();
    }

    @DeleteMapping("user_skill/{id}")
    Boolean deleteUserSkillById(@PathVariable("id") Long id) {
        return service.deleteUserSkillById(id);
    }

}
