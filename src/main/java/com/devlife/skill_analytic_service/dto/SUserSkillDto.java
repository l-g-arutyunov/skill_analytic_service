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
public class SUserSkillDto implements Serializable {
    private Long id;
    private Long acquireData;
    private Long level;
    private SUserDto sUserDtoId;
    private SSkillDto skillDtoId;
    private SGradeDto sGradeDtoId;
}
