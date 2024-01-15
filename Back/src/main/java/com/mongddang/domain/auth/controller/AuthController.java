package com.mongddang.domain.auth.controller;

import com.mongddang.domain.auth.requestObject.RequestSignUpDTO;
import com.mongddang.domain.auth.service.AuthService;
import com.mongddang.global.common.responseEntity.CommonResponseEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@Slf4j
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signUp")
    public ResponseEntity<CommonResponseEntity> signUp(@RequestBody RequestSignUpDTO requestSignUpDTO) {

        authService.signUp(requestSignUpDTO);

        return ResponseEntity.ok().body(CommonResponseEntity.builder().status(HttpStatus.OK).message("회원가입에 성공했습니다.").build());
    }
}
