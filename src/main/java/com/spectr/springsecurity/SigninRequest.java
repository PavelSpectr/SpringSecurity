package com.spectr.springsecurity;

import lombok.Data;

@Data
public class SigninRequest {
    private String username;
    private String password;
}
