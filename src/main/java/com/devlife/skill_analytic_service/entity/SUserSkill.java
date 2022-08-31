package com.devlife.skill_analytic_service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "s_user_skill")
@Data
public class SUserSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long acquireData;

    @Column
    private Long level;

    @ManyToOne
    @JoinColumn
    private SUser sUser;

    @ManyToOne
    @JoinColumn
    private SSkill sSkill;

    @ManyToOne
    @JoinColumn
    private SGrade sGrade;

    @OneToOne
    @JoinColumn
    private SExperience sExperience;
}
