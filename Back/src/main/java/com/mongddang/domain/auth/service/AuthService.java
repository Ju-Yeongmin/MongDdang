package com.mongddang.domain.auth.service;

import com.mongddang.domain.auth.requestObject.RequestSignUpDTO;

public interface AuthService {

    void signUp(RequestSignUpDTO requestSignUpDTO);
}
