package com.devlife.skill_analytic_service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "s_difficulty")
public class Difficulty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "coefficient")
    private Long coefficient;

    @ManyToOne(targetEntity = Skill.class)
    @JoinColumn(name = "skill_id")
    private Skill skill;
}
