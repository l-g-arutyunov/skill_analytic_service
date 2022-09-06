package com.devlife.skill_analytic_service.controller.v1;

import com.devlife.skill_analytic_service.dto.UserSkillDto;
import com.devlife.skill_analytic_service.service.UserSkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class UserSkillController {
    private final UserSkillService service;

    @PutMapping("user_skill")
    Long addUserSkill(@RequestBody UserSkillDto userSkillDto) {
        return service.addUserSkill(userSkillDto);
    }

    @GetMapping("user_skill/{id}")
    UserSkillDto getUserSkill(@PathVariable("id") Long id) {
        return (service.getUserSkill(id));
    }

    @GetMapping("user_skill")
    List<UserSkillDto> getAllUserSkills() {
        return service.getAllUserSkills();
    }

    @DeleteMapping("user_skill/{id}")
    Boolean deleteUserSkillById(@PathVariable("id") Long id) {
        return service.deleteUserSkillById(id);
    }

}
