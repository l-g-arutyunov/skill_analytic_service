package com.devlife.skill_analytic_service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "s_skill_category")
@Data
public class SkillCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(targetEntity = SkillCategoryKind.class)
    @JoinColumn(name = "skill_category_kind_id")
    private SkillCategoryKind skillCategoryKind;
}
