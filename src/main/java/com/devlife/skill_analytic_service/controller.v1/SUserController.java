package com.devlife.skill_analytic_service.controller.v1;

import com.devlife.skill_analytic_service.dto.SUserDto;
import com.devlife.skill_analytic_service.service.SUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class SUserController {
    private final SUserService service;

    @PutMapping("user")
    Long addUser(@RequestBody SUserDto sUserDto) {
        return service.addUser(sUserDto);
    }

    @GetMapping("user/{id}")
    SUserDto getUser(@PathVariable("id") Long id) {
        return (service.getUser(id));
    }

    @GetMapping("user")
    List<SUserDto> getAllUsers() {
        return service.getAllUsers();
    }

    @DeleteMapping("user/{id}")
    Boolean deleteUserById(@PathVariable("id") Long id) {
        return service.deleteUserById(id);
    }

}
