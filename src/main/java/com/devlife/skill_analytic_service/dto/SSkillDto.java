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
public class SSkillDto implements Serializable {
    private Long id;
    private String name;
    private Long parentId;
    private String description;
}
