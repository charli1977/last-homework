package com.example.lasttask.service.impl;

import com.example.lasttask.converter.UserConverter;
import com.example.lasttask.dto.UpdateUserRequest;
import com.example.lasttask.dto.UserRequest;
import com.example.lasttask.dto.UserResponse;
import com.example.lasttask.entity.User;
import com.example.lasttask.repository.UserRepository;
import com.example.lasttask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private UserConverter userConverter;

    @Autowired
    public void UserServiceImpl(UserRepository userRepository, UserConverter userConverter) {
        this.userRepository = userRepository;
        this.userConverter = userConverter;
    }

    public UserServiceImpl(UserRepository userRepository, UserConverter userConverter) {
        this.userRepository = userRepository;
        this.userConverter = userConverter;
    }

    @Override
    public UserResponse saveUser(UserRequest request) {
        User user = userConverter.toUser(request);
        User savedUser = userRepository.save(user);
        return userConverter.toResponse(savedUser);
    }
    @Override
    public UserResponse getUser(Long id) {
        User user = userRepository.findById(id).get();
        return userConverter.toResponse(user);
    }

    @Override
    public String deleteUser(long id) {
        userRepository.deleteById(id);
        return "Deleted user with id " + id;
    }

    @Override
    public UserResponse updateUser(Long id, UpdateUserRequest request) {
        User user = userRepository.findById(id).get();

        if (request.getEmail() != null &&!request.getEmail().isBlank()) {
            user.setEmail(request.getEmail());
        }
        if (request.getPassword() != null &&!request.getPassword().isBlank()) {
            user.setPassword(request.getPassword());
        }

        return userConverter.toResponse(userRepository.save(user));
    }

    @Override
    public UserResponse findByEmail(String email) {
        User user = userRepository.findByEmail(email).get();
        return userConverter.toResponse(user);
    }

}
