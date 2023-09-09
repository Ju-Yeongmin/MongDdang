package com.mongddang.user.domain;

import com.mongddang.user.dto.SignUpDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String loginId;
    String password;
    String name;
    String nickname;

    public User(SignUpDto signUpDto) {
        this.loginId = signUpDto.getLoginId();
        this.password = signUpDto.getPassword();
        this.name = signUpDto.getName();
        this.nickname = signUpDto.getNickname();
    }
}
