package com.serviceImplements;

import com.dto.UserDto;
import com.mapper.BusinessMapper;
import com.repository.UserRepository;
import com.service.UserService;
import models.Role;
import models.UserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;
    @Resource
    private BusinessMapper businessMapper;
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
        UserEntity user = businessMapper.toUserEntity(userDto);
        UserEntity newUserEntity = userRepository.create(user);
        return businessMapper.toUserDto(newUserEntity);
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
        return businessMapper.toUserDto(userRepository.findUserEntityByPhone(phone));
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
