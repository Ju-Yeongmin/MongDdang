package com.mongddang.user.controller;

import com.mongddang.user.dto.SignUpDto;
import com.mongddang.user.service.UserService;
import com.mongddang.user.vo.RequestSignUpVo;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Slf4j
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public void signUp(@RequestBody RequestSignUpVo requestSignUpVo) {
        log.info(requestSignUpVo.toString());
        userService.signUp(new SignUpDto(requestSignUpVo));

    }

    @PostMapping("/login")
    public void login() {
    }
}
