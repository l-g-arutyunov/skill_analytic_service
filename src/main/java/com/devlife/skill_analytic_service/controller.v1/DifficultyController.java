package com.devlife.skill_analytic_service.controller.v1;

import com.devlife.skill_analytic_service.dto.DifficultyDto;
import com.devlife.skill_analytic_service.service.DifficultyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class DifficultyController {
    private final DifficultyService service;

    @PutMapping("difficulty")
    Long addDifficulty(@RequestBody DifficultyDto difficultyDto) {
        return service.addDifficulty(difficultyDto);
    }

    @GetMapping("difficulty/{id}")
    DifficultyDto getDifficulty(@PathVariable("id") Long id) {
        return service.getDifficulty(id);
    }

    @GetMapping("difficulty")
    List<DifficultyDto> getAllDifficulties() {
        return service.getAllDifficulties();
    }

    @DeleteMapping("difficulty/{id}")
    Boolean deleteDifficultById(@PathVariable("id") Long id) {
        return service.deleteDifficultById(id);
    }

}
