package com.mapper;

import com.dto.UserDto;
import models.UserEntity;
import org.springframework.stereotype.Service;

@Service
public class BusinessMapper {
  public UserEntity toUserEntity(UserDto userDto){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userDto.getId());
        userEntity.setPhone(userDto.getPhone());
        userEntity.setActive(userDto.isActive());
        userEntity.setRole(userDto.getRole());
        userEntity.setCreated(userDto.getCreated());
        userEntity.setUpdated(userDto.getUpdated());
        return userEntity;
    }
    public UserDto toUserDto(UserEntity user){
      UserDto userDto =new UserDto();
      userDto.setId(user.getId());
      userDto.setPhone(user.getPhone());
      userDto.setActive(user.isActive());
      userDto.setRole(user.getRole());
      userDto.setCreated(user.getCreated());
      userDto.setUpdated(user.getUpdated());
      return userDto;
    }
}
