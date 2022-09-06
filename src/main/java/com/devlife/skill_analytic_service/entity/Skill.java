package com.devlife.skill_analytic_service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "s_skill")
@Data
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "parent_id")
    private Long parentId;

    @Column(name = "description")
    private String description;

}
