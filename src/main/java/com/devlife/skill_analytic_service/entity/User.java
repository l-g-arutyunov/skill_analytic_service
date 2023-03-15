package com.devlife.skill_analytic_service.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "s_user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s_user_id_seq")
    @SequenceGenerator(name = "s_user_id_seq", sequenceName = "s_user_id_seq", allocationSize = 1)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "nickname")
    @EqualsAndHashCode.Include
    private String nickName;

    @Column(name = "external_id")
    @EqualsAndHashCode.Include
    private Long externalId;

    @Column(name = "first_name")
    @EqualsAndHashCode.Include
    private String firstName;

    @Column(name = "last_name")
    @EqualsAndHashCode.Include
    private String lastName;

}
