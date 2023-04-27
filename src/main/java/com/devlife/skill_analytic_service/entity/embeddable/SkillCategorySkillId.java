package com.devlife.skill_analytic_service.entity.embeddable;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class SkillCategorySkillId implements Serializable {
    @Column(name = "s_skill_category_id")
    private Long skillCategoryId;

    @Column(name = "s_skill_id")
    private Long skillId;
}
