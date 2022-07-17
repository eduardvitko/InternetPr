package com.serviceImplements;

import com.dto.UserDto;
import com.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public UserDto createUser(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto findByID(int id) {
        return null;
    }

    @Override
    public UserDto findByPhone(String phone) {
        return null;
    }

    @Override
    public boolean deleteUser(int id) {
        return false;
    }

    @Override
    public List<UserDto> findAll() {
        return null;
    }
}
