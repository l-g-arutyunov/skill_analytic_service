package com.devlife.skill_analytic_service.controller.v1;

import com.devlife.skill_analytic_service.dto.GradeDto;
import com.devlife.skill_analytic_service.service.GradeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class GradeController {
    private final GradeService service;

    @PutMapping("grade")
    Long addGrade(@RequestBody GradeDto gradeDto) {
        return service.addGrade(gradeDto);
    }

    @GetMapping("grade/{id}")
    GradeDto getGrade(@PathVariable("id") Long id) {
        return service.getGrade(id);
    }

    @GetMapping("grade")
    List<GradeDto> getAllGrades() {
        return service.getAllGrades();
    }

    @DeleteMapping("grade/{id}")
    Boolean deleteGradeById(@PathVariable("id") Long id) {
        return service.deleteGradeById(id);
    }

}
