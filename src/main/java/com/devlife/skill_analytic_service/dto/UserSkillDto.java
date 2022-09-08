package com.devlife.skill_analytic_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserSkillDto implements Serializable {
    private Long id;
    private LocalDate acquireData;
    private Long level;
    private UserDto user;
    private SkillDto skill;
    private GradeDto grade;
}
