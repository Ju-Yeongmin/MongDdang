package com.mongddang.user.dto;

import com.mongddang.user.vo.RequestSignUpVo;
import lombok.Getter;

@Getter
public class SignUpDto {
    String loginId;
    String password;
    String name;
    String nickname;

    public SignUpDto(RequestSignUpVo requestSignUpVo) {
        this.loginId = requestSignUpVo.getLoginId();
        this.password = requestSignUpVo.getPassword();
        this.name = requestSignUpVo.getName();
        this.nickname = requestSignUpVo.getNickname();
    }
}
