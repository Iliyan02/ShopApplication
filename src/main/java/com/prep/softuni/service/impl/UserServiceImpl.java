package com.prep.softuni.service.impl;

import com.prep.softuni.models.entity.User;
import com.prep.softuni.repository.UserRepository;
import com.prep.softuni.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    public UserServiceImpl(ModelMapper modelMapper, UserRepository userRepository) {
        this.modelMapper = modelMapper;
        this.userRepository = userRepository;
    }

    @Override
    public void addToDatabase(User map) {
        userRepository.save(modelMapper.map(map, User.class));
    }

    @Override
    public User findByUsernameAndPassword(String username, String password) {
       return userRepository.findByUsernameAndPassword(username, password).orElse(null);
    }
}
