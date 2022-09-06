package com.devlife.skill_analytic_service.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "s_user_skill")
@Data
public class UserSkill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "acquire_date")
    private LocalDate acquireData;

    @Column(name = "level")
    private Long level;

    @ManyToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(targetEntity = Skill.class)
    @JoinColumn(name = "skill_id")
    private Skill skill;

    @ManyToOne(targetEntity = Grade.class)
    @JoinColumn(name = "grade_id")
    private Grade grade;
}
