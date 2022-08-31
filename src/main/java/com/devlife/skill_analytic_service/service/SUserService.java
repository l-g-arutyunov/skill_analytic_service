package com.devlife.skill_analytic_service.service;

import com.devlife.skill_analytic_service.dto.SUserDto;
import com.devlife.skill_analytic_service.entity.SUser;
import com.devlife.skill_analytic_service.mapper.SUserMapper;
import com.devlife.skill_analytic_service.repository.SUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SUserService {
    private final SUserRepository sUserRepository;
    private final SUserMapper mapper;

    public Long addUser(SUserDto sUserDto) {
        SUser saveUser = sUserRepository.save(mapper.convertToEntity(sUserDto));
        if (saveUser != null) {
            return saveUser.getId();
        }
        return null;
    }

    public SUserDto getUser(Long id) {
        SUser sUser = sUserRepository.getById(id);
        return mapper.convertToDto(sUser);
    }

    public List<SUserDto> getAllUsers() {
        List<SUser> sUserList = sUserRepository.findAll();
        return sUserList.stream().map(mapper::convertToDto).collect(Collectors.toList());
    }

    public Boolean deleteUserById(Long id) {
        sUserRepository.deleteById(id);
        return !sUserRepository.existsById(id);
    }
}
