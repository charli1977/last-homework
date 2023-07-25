package com.example.lasttask.converter;

import com.example.lasttask.dto.UserRequest;
import com.example.lasttask.dto.UserResponse;
import com.example.lasttask.entity.User;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Date;

@Component
public class UserConverter {
    public User toUser(UserRequest request){
        return User.builder()
                .name(request.getName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(request.getPassword())
                .registerData(Date.from(Instant.now()))
                .build();
    }
    public UserResponse toResponse(User user){
        return UserResponse.builder()
                .name(user.getName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .build();
    }

}
