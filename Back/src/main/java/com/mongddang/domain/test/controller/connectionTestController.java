package com.mongddang.domain.test.controller;

import com.mongddang.global.common.responseEntity.CommonResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/connectionTest")
public class connectionTestController {

    @GetMapping
    public ResponseEntity<CommonResponseEntity<String>> connectionTest() {
        return ResponseEntity.ok().body(CommonResponseEntity.<String>builder().status(HttpStatus.OK).message("요청에 성공했습니다.").data("연결 성공!").build());
    }
}
