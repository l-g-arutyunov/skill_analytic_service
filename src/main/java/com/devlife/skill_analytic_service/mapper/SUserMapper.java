package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.SUserDto;
import com.devlife.skill_analytic_service.entity.SUser;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SUserMapper {
    private final ModelMapper mapper;

    public SUser convertToEntity(SUserDto sUserDto) {
        return mapper.map(sUserDto, SUser.class);
    }

    public SUserDto convertToDto(SUser sUser) {
        return mapper.map(sUser, SUserDto.class);
    }
}
