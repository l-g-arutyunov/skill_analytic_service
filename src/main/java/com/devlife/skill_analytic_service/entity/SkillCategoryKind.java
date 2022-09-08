package com.devlife.skill_analytic_service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "s_skill_category_kind")
@Data
public class SkillCategoryKind {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
