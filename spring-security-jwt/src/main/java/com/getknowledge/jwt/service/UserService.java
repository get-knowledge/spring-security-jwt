package com.getknowledge.jwt.service;

import java.util.List;

import com.getknowledge.jwt.model.User;
import com.getknowledge.jwt.model.UserDto;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserDto update(UserDto userDto);
}
