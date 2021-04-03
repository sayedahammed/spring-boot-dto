package com.example.springdtovalidation.controller;

import com.example.springdtovalidation.dto.UserDto;
import com.example.springdtovalidation.model.User;
import com.example.springdtovalidation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("users")
    public ResponseEntity<UserDto> createUser(@Valid @RequestBody UserDto userDto) {

        User user = new User();
        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        User saveUser = userService.createUser(user);

        UserDto userResponse = new UserDto();
        userResponse.setId(saveUser.getId());
        userResponse.setName(saveUser.getName());
        userResponse.setEmail(saveUser.getEmail());

        return new ResponseEntity<>(userResponse, HttpStatus.CREATED);
    }
}
