package com.devlife.skill_analytic_service.repository;

import com.devlife.skill_analytic_service.entity.SSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SSkillRepository extends JpaRepository<SSkill, Long> {
}
