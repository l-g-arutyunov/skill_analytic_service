package com.devlife.skill_analytic_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SkillCategorySkillDto {
    private Long skillCategoryId;
    private Long skillId;
}
