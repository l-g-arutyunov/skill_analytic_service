package com.devlife.skill_analytic_service.controller.v1;

import com.devlife.skill_analytic_service.dto.ExperienceDto;
import com.devlife.skill_analytic_service.service.ExperienceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class ExperienceController {
    private final ExperienceService service;

    @PutMapping("experience")
    Long addExperience(@RequestBody ExperienceDto experienceDto) {
        return service.addExperience(experienceDto);
    }

    @GetMapping("experience/{id}")
    ExperienceDto getExperience(@PathVariable("id") Long id) {
        return (service.getExperience(id));
    }

    @GetMapping("experience")
    List<ExperienceDto> getAllExperiences() {
        return service.getAllExperiences();
    }

    @DeleteMapping("experience/{id}")
    Boolean deleteExperienceById(@PathVariable("id") Long id) {
        return service.deleteExperienceById(id);
    }

}
