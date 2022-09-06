package com.devlife.skill_analytic_service.controller.v1;

import com.devlife.skill_analytic_service.dto.SkillCategoryKindDto;
import com.devlife.skill_analytic_service.service.SkillCategoryKindService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class SkillCategoryKindController {
    private final SkillCategoryKindService service;

    @PutMapping("skill_category_kind")
    Long addSkillCategoryKind(@RequestBody SkillCategoryKindDto skillCategoryKindDto) {
        return service.addSkillCategoryKind(skillCategoryKindDto);
    }

    @GetMapping("skill_category_kind/{id}")
    SkillCategoryKindDto getSkillCategoryKind(@PathVariable("id") Long id) {
        return service.getSkillCategoryKind(id);
    }

    @GetMapping("skill_category_kind")
    List<SkillCategoryKindDto> getAllSkillCategoryKinds() {
        return service.getAllSkillCategoryKinds();
    }

    @DeleteMapping("skill_category_kind/{id}")
    Boolean deleteSkillCategoryKindById(@PathVariable("id") Long id) {
        return service.deleteSkillCategoryKindById(id);
    }

}
