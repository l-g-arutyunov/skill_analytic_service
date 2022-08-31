package com.devlife.skill_analytic_service.controller.v1;

import com.devlife.skill_analytic_service.dto.SSkillCategoryKindDto;
import com.devlife.skill_analytic_service.service.SSkillCategoryKindService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class SSkillCategoryKindController {
    private final SSkillCategoryKindService service;

    @PutMapping("skill_category_kind")
    Long addSkillCategoryKind(@RequestBody SSkillCategoryKindDto sSkillCategoryKindDto) {
        return service.addSkillCategoryKind(sSkillCategoryKindDto);
    }

    @GetMapping("skill_category_kind/{id}")
    SSkillCategoryKindDto getSkillCategoryKind(@PathVariable("id") Long id) {
        return (service.getSkillCategoryKind(id));
    }

    @GetMapping("skill_category_kind")
    List<SSkillCategoryKindDto> getAllSkillCategoryKinds() {
        return service.getAllSkillCategoryKinds();
    }

    @DeleteMapping("skill_category_kind/{id}")
    Boolean deleteSkillCategoryKindById(@PathVariable("id") Long id) {
        return service.deleteSkillCategoryKindById(id);
    }

}
