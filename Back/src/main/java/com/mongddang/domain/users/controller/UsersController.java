package com.mongddang.domain.users.controller;

import com.mongddang.global.common.responseEntity.CommonResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    @GetMapping("")
    public ResponseEntity<CommonResponseEntity<String>> hello() {
        return ResponseEntity.ok().body(CommonResponseEntity.<String>builder().status(HttpStatus.OK).message("테스트 성공").data("테스트 데이터").build());
    }

}
