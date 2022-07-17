package com.repository;
import models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    UserEntity create(UserEntity user);

    UserEntity updateProfile(UserEntity user);

    UserEntity findById(int id);

    UserEntity findUserEntityByPhone(String phone);

    boolean deleteUserEntity(int id);

    List<UserEntity> findAll();
}
