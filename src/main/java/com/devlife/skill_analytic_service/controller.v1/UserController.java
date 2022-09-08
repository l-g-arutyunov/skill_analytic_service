package com.devlife.skill_analytic_service.controller.v1;

import com.devlife.skill_analytic_service.dto.UserDto;
import com.devlife.skill_analytic_service.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("api/v1/")
public class UserController {
    private final UserService service;

    @PutMapping("user")
    Long addUser(@RequestBody UserDto userDto) {
        return service.addUser(userDto);
    }

    @GetMapping("user/{id}")
    UserDto getUser(@PathVariable("id") Long id) {
        return service.getUser(id);
    }

    @GetMapping("user")
    List<UserDto> getAllUsers() {
        return service.getAllUsers();
    }

    @DeleteMapping("user/{id}")
    Boolean deleteUserById(@PathVariable("id") Long id) {
        return service.deleteUserById(id);
    }

}
