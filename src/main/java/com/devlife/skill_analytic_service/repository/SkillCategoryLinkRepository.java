package com.devlife.skill_analytic_service.repository;

import com.devlife.skill_analytic_service.entity.SkillCategoryLink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillCategoryLinkRepository extends JpaRepository<SkillCategoryLink, Long> {
}
