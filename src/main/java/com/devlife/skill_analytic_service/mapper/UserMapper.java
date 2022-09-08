package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.UserDto;
import com.devlife.skill_analytic_service.entity.User;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapper {
    private final ModelMapper mapper;

    public User convertToEntity(UserDto userDto) {
        return mapper.map(userDto, User.class);
    }

    public UserDto convertToDto(User user) {
        return mapper.map(user, UserDto.class);
    }
}
