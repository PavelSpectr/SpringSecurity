package com.spectr.springsecurity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
public class SignupRequest {
    private String username;
    private String email;
    private String password;
}
