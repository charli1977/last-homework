package com.example.lasttask.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserResponse {
    String email;
    String name;
    String lastName;

}
