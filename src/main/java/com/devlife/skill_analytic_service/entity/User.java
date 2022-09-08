package com.devlife.skill_analytic_service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "s_user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
}
