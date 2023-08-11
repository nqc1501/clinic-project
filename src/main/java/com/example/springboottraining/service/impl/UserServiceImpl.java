package com.example.springboottraining.service.impl;

import com.example.springboottraining.entity.UserEntity;
import com.example.springboottraining.repository.UserRepository;
import com.example.springboottraining.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserEntity> getListUser() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserEntity> getUserById(Integer id) {
        return userRepository.findById(id);
    }

    @Override
    public void create(UserEntity user) {
        userRepository.save(user);
    }

    @Override
    public boolean userExists(UserEntity user) {
        return userRepository.findById(user.getId()).isEmpty();
    }
}
