package com.devlife.skill_analytic_service.entity;

import com.devlife.skill_analytic_service.entity.embeddable.SkillCategoryLinkId;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "s_skill_category_link")
@Data
public class SkillCategoryLink {
    @EmbeddedId
    private SkillCategoryLinkId skillCategoryLinkId;
}
