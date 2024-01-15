package com.mongddang.global.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<ErrorResponseEntity> handleBusinessException(BusinessException e){
        ErrorCode errorCode = e.getErrorCode();
        ErrorResponseEntity response = new ErrorResponseEntity(errorCode.getStatus(), errorCode.getCode(), errorCode.getDescription());

        return new ResponseEntity<>(response, HttpStatus.valueOf(errorCode.getStatus()));
    }

}
