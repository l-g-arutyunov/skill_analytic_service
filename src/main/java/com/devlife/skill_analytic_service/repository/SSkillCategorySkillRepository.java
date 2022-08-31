package com.devlife.skill_analytic_service.repository;

import com.devlife.skill_analytic_service.entity.SSkillCategorySkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SSkillCategorySkillRepository extends JpaRepository<SSkillCategorySkill, Long> {
}
