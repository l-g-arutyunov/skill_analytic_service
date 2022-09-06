package com.devlife.skill_analytic_service.repository;

import com.devlife.skill_analytic_service.entity.SkillCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillCategoryRepository extends JpaRepository<SkillCategory, Long> {
}
