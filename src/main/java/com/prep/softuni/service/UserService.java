package com.prep.softuni.service;

import com.prep.softuni.models.entity.User;

public interface UserService {
    void addToDatabase(User map);

    User findByUsernameAndPassword(String username, String password);
}
