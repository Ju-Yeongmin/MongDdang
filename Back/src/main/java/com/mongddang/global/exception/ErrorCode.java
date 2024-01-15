package com.mongddang.global.exception;

import lombok.Getter;

@Getter
public enum ErrorCode {
    TEST_ERROR_CODE(400, "ERROR-001", "테스트 에러 입니다.");

    private final int status;
    private final String code;
    private final String Description;

    ErrorCode(int status, String code, String Description) {
        this.status = status;
        this.code = code;
        this.Description = Description;
    }


}
