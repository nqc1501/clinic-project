package com.example.springboottraining.service;

import com.example.springboottraining.entity.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    List<UserEntity> getListUser();

    Optional<UserEntity> getUserById(Integer id);

    void create(UserEntity user);

    boolean userExists(UserEntity user);
}
