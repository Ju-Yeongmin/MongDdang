package com.mongddang.user.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RequestSignUpVo {
    String loginId;
    String password;
    String name;
    String nickname;
}
