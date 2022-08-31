package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.SSkillCategorySkillDto;
import com.devlife.skill_analytic_service.entity.SSkillCategorySkill;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;

@Component
public class SSkillCategorySkillMapper {
    private final ModelMapper mapper;

    public SSkillCategorySkillMapper(ModelMapper mapper) {
        this.mapper = mapper;
        mapper.addMappings(new PropertyMap<SSkillCategorySkillDto, SSkillCategorySkill>() {
            @Override
            protected void configure() {
                map().getSSkillCategorySkillId().setSSkillCategoryId(source.getSSkillCategoryId());
                map().getSSkillCategorySkillId().setSSkillId(source.getSSkillId());
            }
        });
    }

    public SSkillCategorySkill convertToEntity(SSkillCategorySkillDto sSkillCategorySkillDto) {
        return mapper.map(sSkillCategorySkillDto, SSkillCategorySkill.class);
    }

    public SSkillCategorySkillDto convertToDto(SSkillCategorySkill sSkillCategorySkill) {
        return mapper.map(sSkillCategorySkill, SSkillCategorySkillDto.class);
    }
}
