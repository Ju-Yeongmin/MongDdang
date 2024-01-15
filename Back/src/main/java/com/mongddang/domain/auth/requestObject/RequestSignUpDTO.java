package com.mongddang.domain.auth.requestObject;

import com.mongddang.domain.users.model.Users;
import lombok.*;
import org.springframework.security.crypto.password.PasswordEncoder;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class RequestSignUpDTO {

    private String loginId;
    private String password;
    private String name;
    private String phone;
    private String nickname;
    private String email;


    public Users toEntity(PasswordEncoder passwordEncoder) {
        return Users.builder()
                .loginId(loginId)
                .password(passwordEncoder.encode(password))
                .name(name)
                .phone(phone)
                .nickname(nickname)
                .email(email)
                .build();
    }
}
