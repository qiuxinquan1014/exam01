package com.example.exam01.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String prems;
    private String role;
}
