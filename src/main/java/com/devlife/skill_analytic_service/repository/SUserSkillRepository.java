package com.devlife.skill_analytic_service.repository;

import com.devlife.skill_analytic_service.entity.SUserSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SUserSkillRepository extends JpaRepository<SUserSkill, Long> {
}
