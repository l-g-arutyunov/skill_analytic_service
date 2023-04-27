package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.SkillCategoryLinkDto;
import com.devlife.skill_analytic_service.entity.SkillCategoryLink;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.stereotype.Component;

@Component
public class SkillCategoryLinkMapper {
    private final ModelMapper mapper;

    public SkillCategoryLinkMapper(ModelMapper mapper) {
        this.mapper = mapper;
        mapper.addMappings(new PropertyMap<SkillCategoryLinkDto, SkillCategoryLink>() {
            @Override
            protected void configure() {
                map().getSkillCategorySkillId().setSkillCategoryId(source.getSkillCategoryId());
                map().getSkillCategorySkillId().setSkillId(source.getSkillId());
            }
        });
    }

    public SkillCategoryLink convertToEntity(SkillCategoryLinkDto skillCategoryLinkDto) {
        return mapper.map(skillCategoryLinkDto, SkillCategoryLink.class);
    }

    public SkillCategoryLinkDto convertToDto(SkillCategoryLink skillCategoryLink) {
        return mapper.map(skillCategoryLink, SkillCategoryLinkDto.class);
    }
}
