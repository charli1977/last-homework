package com.example.lasttask.service;

import com.example.lasttask.dto.UpdateUserRequest;
import com.example.lasttask.dto.UserRequest;
import com.example.lasttask.dto.UserResponse;

public interface UserService {
    UserResponse saveUser(UserRequest request);
    UserResponse getUser(Long id);

    String deleteUser(long id);

    UserResponse updateUser(Long id, UpdateUserRequest request);

    UserResponse findByEmail(String email);
}
