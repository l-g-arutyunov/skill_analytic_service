package com.devlife.skill_analytic_service.mapper;

import com.devlife.skill_analytic_service.dto.UserDto;
import com.devlife.skill_analytic_service.entity.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ActiveProfiles("dev")
@DisplayName("User Mapper Tests")
class UserMapperTest {
    @Autowired
    UserMapper mapper;

    @Test
    @DisplayName("Конвертируем ДТО User в Энтити")
    void convertToEntityTest_OK() {
        User referenceUser = new User();
        referenceUser.setId(1L);
        referenceUser.setNickName("nickname");
        UserDto userDto = UserDto.builder()
                .id(1L)
                .nickName("nickname")
                .build();
        User user = mapper.convertToEntity(userDto);
        assertEquals(referenceUser,user);
    }

    @Test
    @DisplayName("Конвертируем Энтити User в ДТО ")
    void convertToDtoTest_OK() {
        UserDto referenceUserDto = UserDto.builder()
                .id(1L)
                .nickName("nickname")
                .build();
        User user = new User();
        user.setId(1L);
        user.setNickName("nickname");
        UserDto userDto = mapper.convertToDto(user);
        assertEquals(referenceUserDto,userDto);
    }
}