package com.service;

import com.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);

    UserDto updateUser(UserDto userDto);

    UserDto findByID(int id);

    UserDto findByPhone(String phone);

    boolean deleteUser(int id);

    List<UserDto> findAll();
}
