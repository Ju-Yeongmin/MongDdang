package com.mongddang.global.common.responseEntity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommonResponseEntity<T> {
    private Enum<HttpStatus> status;
    private String message;
    private T data;
}
