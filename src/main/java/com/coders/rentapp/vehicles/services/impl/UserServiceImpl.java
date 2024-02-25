package com.coders.rentapp.vehicles.services.impl;

import com.coders.rentapp.vehicles.entities.User;
import com.coders.rentapp.vehicles.repositories.UserRepository;
import com.coders.rentapp.vehicles.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Integer id) {
        userRepository.findById(id);
        return null;
    }

    @Override
    public User createUser(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public User updateUser(Integer id, User user) {
        userRepository.findById(id).ifPresent(entity -> userRepository.save(user));
        return user;
    }

    @Override
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
