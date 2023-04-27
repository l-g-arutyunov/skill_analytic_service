package com.devlife.skill_analytic_service.entity.embeddable;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class SkillCategoryLinkId implements Serializable {
    @Column(name = "skill_category_id")
    private Long skillCategoryId;

    @Column(name = "skill_id")
    private Long skillId;
}
