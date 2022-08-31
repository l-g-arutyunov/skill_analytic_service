package com.devlife.skill_analytic_service.controller.v1;

import com.devlife.skill_analytic_service.dto.SGradeDto;
import com.devlife.skill_analytic_service.service.SGradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class SGradeController {
    private final SGradeService service;

    @PutMapping("grade")
    Long addGrade(@RequestBody SGradeDto sGradeDto) {
        return service.addGrade(sGradeDto);
    }

    @GetMapping("grade/{id}")
    SGradeDto getGrade(@PathVariable("id") Long id) {
        return (service.getGrade(id));
    }

    @GetMapping("grade")
    List<SGradeDto> getAllGrades() {
        return service.getAllGrades();
    }

    @DeleteMapping("grade/{id}")
    Boolean deleteGradeById(@PathVariable("id") Long id) {
        return service.deleteGradeById(id);
    }

}
