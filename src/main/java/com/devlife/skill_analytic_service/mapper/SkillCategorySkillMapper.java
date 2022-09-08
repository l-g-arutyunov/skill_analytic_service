package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.SkillCategorySkillDto;
import com.devlife.skill_analytic_service.entity.SkillCategorySkill;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;

@Component
public class SkillCategorySkillMapper {
    private final ModelMapper mapper;

    public SkillCategorySkillMapper(ModelMapper mapper) {
        this.mapper = mapper;
        mapper.addMappings(new PropertyMap<SkillCategorySkillDto, SkillCategorySkill>() {
            @Override
            protected void configure() {
                map().getSkillCategorySkillId().setSkillCategoryId(source.getSkillCategoryId());
                map().getSkillCategorySkillId().setSkillId(source.getSkillId());
            }
        });
    }

    public SkillCategorySkill convertToEntity(SkillCategorySkillDto skillCategorySkillDto) {
        return mapper.map(skillCategorySkillDto, SkillCategorySkill.class);
    }

    public SkillCategorySkillDto convertToDto(SkillCategorySkill skillCategorySkill) {
        return mapper.map(skillCategorySkill, SkillCategorySkillDto.class);
    }
}
