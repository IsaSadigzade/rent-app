package com.coders.rentapp.vehicles.services;

import com.coders.rentapp.vehicles.entities.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUserById(Integer id);
    User createUser(User user);
    User updateUser(Integer id, User user);
    void deleteUser(Integer id);


}
