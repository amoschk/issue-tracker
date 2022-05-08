package com.amos.issuetracker.service;

import com.amos.issuetracker.dto.UserDto;
import com.amos.issuetracker.mapper.UserMapper;
import com.amos.issuetracker.model.User;
import com.amos.issuetracker.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;
    public void createUser(UserDto userDto){
        userRepository.save(userMapper.toUser(userDto));
    }
}
