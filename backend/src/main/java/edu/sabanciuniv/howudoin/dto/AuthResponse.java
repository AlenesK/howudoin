package edu.sabanciuniv.howudoin.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthResponse {
    private String token;
    private String email;
    private String firstName;
    private String lastName;
}
