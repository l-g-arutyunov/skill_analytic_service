package com.devlife.skill_analytic_service.controller.v1;

import com.devlife.skill_analytic_service.dto.SDifficultyDto;
import com.devlife.skill_analytic_service.service.SDifficultyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class SDifficultyController {
    private final SDifficultyService service;

    @PutMapping("difficulty")
    Long addDifficulty(@RequestBody SDifficultyDto sDifficultyDto) {
        return service.addDifficulty(sDifficultyDto);
    }

    @GetMapping("difficulty/{id}")
    SDifficultyDto getDifficulty(@PathVariable("id") Long id) {
        return (service.getDifficulty(id));
    }

    @GetMapping("difficulty")
    List<SDifficultyDto> getAllDifficulties() {
        return service.getAllDifficulties();
    }

    @DeleteMapping("difficulty/{id}")
    Boolean deleteDifficultById(@PathVariable("id") Long id) {
        return service.deleteDifficultById(id);
    }

}
