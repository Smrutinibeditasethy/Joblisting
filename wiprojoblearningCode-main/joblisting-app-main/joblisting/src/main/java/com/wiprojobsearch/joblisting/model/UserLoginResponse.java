package com.wiprojobsearch.joblisting.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginResponse {


    private String userId;
    private String username;
    private String email;
    private String phoneNumber;

/*
    public UserLoginResponse(String userId, String username, String email, String phoneNumber) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }*/


}
