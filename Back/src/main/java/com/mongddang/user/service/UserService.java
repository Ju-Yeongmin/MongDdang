package com.mongddang.user.service;

import com.mongddang.user.domain.User;
import com.mongddang.user.dto.SignUpDto;
import com.mongddang.user.repository.UserRepository;
import com.mongddang.user.vo.RequestSignUpVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void signUp(SignUpDto signUpDto) {

        User user = new User(signUpDto);

        userRepository.save(user);

    }

}
