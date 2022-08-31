package com.devlife.skill_analytic_service.entity.embeddable;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class SSkillCategorySkillId implements Serializable {
    @Column(name = "s_skill_category_id")
    private Long sSkillCategoryId;

    @Column(name = "s_skill_id")
    private Long sSkillId;
}
