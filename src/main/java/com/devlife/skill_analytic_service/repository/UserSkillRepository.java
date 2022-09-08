package com.devlife.skill_analytic_service.repository;

import com.devlife.skill_analytic_service.entity.UserSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSkillRepository extends JpaRepository<UserSkill, Long> {
}
