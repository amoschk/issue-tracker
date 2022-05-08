package com.amos.issuetracker.mapper;

import com.amos.issuetracker.dto.UserDto;
import com.amos.issuetracker.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel =  "spring")
public interface UserMapper {

    User toUser(UserDto userDto);
}
