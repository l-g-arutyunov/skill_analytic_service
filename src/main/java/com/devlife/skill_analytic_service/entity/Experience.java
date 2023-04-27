package com.devlife.skill_analytic_service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "s_experience")
@Data
public class Experience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "value")
    private Long valueExp;

    @OneToOne(targetEntity = UserSkill.class)
    @JoinColumn(name = "user_skill_id")
    private UserSkill userSkill;

}
