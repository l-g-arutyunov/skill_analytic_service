package com.devlife.skill_analytic_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DifficultyDto implements Serializable {
    private Long id;
    private String name;
    private Long coefficient;
    private SkillDto skill;
}
