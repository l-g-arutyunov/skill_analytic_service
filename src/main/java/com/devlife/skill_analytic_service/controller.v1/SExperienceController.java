package com.devlife.skill_analytic_service.controller.v1;

import com.devlife.skill_analytic_service.dto.SExperienceDto;
import com.devlife.skill_analytic_service.service.SExperienceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class SExperienceController {
    private final SExperienceService service;

    @PutMapping("experience")
    Long addExperience(@RequestBody SExperienceDto sExperienceDto) {
        return service.addExperience(sExperienceDto);
    }

    @GetMapping("experience/{id}")
    SExperienceDto getExperience(@PathVariable("id") Long id) {
        return (service.getExperience(id));
    }

    @GetMapping("experience")
    List<SExperienceDto> getAllExperiences() {
        return service.getAllExperiences();
    }

    @DeleteMapping("experience/{id}")
    Boolean deleteExperienceById(@PathVariable("id") Long id) {
        return service.deleteExperienceById(id);
    }

}
