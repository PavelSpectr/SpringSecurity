package com.spectr.springsecurity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
public class SigninRequest {
    private String username;
    private String password;
}
