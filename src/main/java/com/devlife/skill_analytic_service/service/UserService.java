package com.devlife.skill_analytic_service.service;

import com.devlife.skill_analytic_service.dto.UserDto;
import com.devlife.skill_analytic_service.entity.User;
import com.devlife.skill_analytic_service.mapper.UserMapper;
import com.devlife.skill_analytic_service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper mapper;

    public Long addUser(UserDto userDto) {
        User saveUser = userRepository.save(mapper.convertToEntity(userDto));
        if (saveUser != null) {
            return saveUser.getId();
        }
        return null;
    }

    public UserDto getUser(Long id) {
        User user = userRepository.getById(id);
        return mapper.convertToDto(user);
    }

    public List<UserDto> getAllUsers() {
        List<User> userList = userRepository.findAll();
        return userList.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }

    public Boolean deleteUserById(Long id) {
        userRepository.deleteById(id);
        return !userRepository.existsById(id);
    }
}
