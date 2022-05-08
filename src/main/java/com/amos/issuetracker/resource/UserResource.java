package com.amos.issuetracker.resource;

import com.amos.issuetracker.dto.UserDto;
import com.amos.issuetracker.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("user/")
public class UserResource {

    private final UserService userService;

    @PostMapping("/create")
    public void createUser(@RequestBody UserDto userDto){
        userService.createUser(userDto);
    }
}
