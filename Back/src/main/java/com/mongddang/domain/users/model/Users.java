package com.mongddang.domain.users.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.ToString;

@Entity
@Builder
@ToString
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String loginId;
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String phone;
    @Column(nullable = false)
    private String nickname;
    @Column(nullable = false)
    private String email;

}