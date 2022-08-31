package com.devlife.skill_analytic_service.repository;

import com.devlife.skill_analytic_service.entity.SSkillCategoryKind;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SSkillCategoryKindRepository extends JpaRepository<SSkillCategoryKind, Long>{
}
