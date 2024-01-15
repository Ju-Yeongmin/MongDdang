package com.mongddang.domain.auth.service;

import com.mongddang.domain.auth.requestObject.RequestSignUpDTO;
import com.mongddang.domain.users.model.Users;
import com.mongddang.domain.users.repository.UserRepository;
import com.mongddang.global.exception.BusinessException;
import com.mongddang.global.exception.ErrorCode;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthServiceImpl implements AuthService{

        private final UserRepository userRepository;
        private final PasswordEncoder passwordEncoder;

        @Override
        public void signUp(RequestSignUpDTO requestSignUpDTO) {
            try {
                Users users = userRepository.save(requestSignUpDTO.toEntity(passwordEncoder));
            } catch (Exception e) {
                throw new BusinessException(ErrorCode.TEST_ERROR_CODE);
            }
        }
}
