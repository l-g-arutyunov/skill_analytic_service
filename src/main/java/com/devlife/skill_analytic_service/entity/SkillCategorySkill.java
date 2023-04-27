package com.devlife.skill_analytic_service.entity;

import com.devlife.skill_analytic_service.entity.embeddable.SkillCategorySkillId;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "s_skill_category_skill")
@Data
public class SkillCategorySkill {
    @EmbeddedId
    private SkillCategorySkillId skillCategorySkillId;
}
