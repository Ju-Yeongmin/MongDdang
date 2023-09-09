package com.mongddang.ResponseEntitiy;

import lombok.*;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommonResponseEntity {
    String message;
    String code;
    Object data;
}
