package com.devlife.skill_analytic_service.entity;

import com.devlife.skill_analytic_service.entity.embeddable.SSkillCategorySkillId;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "s_skill")
@Data
public class SSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private Long parentId;

    @Column
    private String description;

    @JoinColumn
    @ManyToOne
    private SSkillCategory sSkillCategory;
}
