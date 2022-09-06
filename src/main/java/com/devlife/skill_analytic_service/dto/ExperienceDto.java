package com.devlife.skill_analytic_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExperienceDto implements Serializable {
    private Long id;
    private Long valueExp;
    private UserSkillDto userSkill;
}
