package com.nhnacademy.minidooray_accountapi.service;

import com.nhnacademy.minidooray_accountapi.dto.LoginRequestDto;
import com.nhnacademy.minidooray_accountapi.dto.LoginResponseDto;
import com.nhnacademy.minidooray_accountapi.entity.User;
import com.nhnacademy.minidooray_accountapi.exception.InvalidLoginRequest;
import com.nhnacademy.minidooray_accountapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserLoginServce {
    private final UserRepository userRepository;

    public LoginResponseDto login(LoginRequestDto loginRequestDto) {
        List<User> users = userRepository.findByUserId(loginRequestDto.getUserId());

        for (User user : users) {
            LoginResponseDto loginResponseDto = new LoginResponseDto();
            loginResponseDto.setUserUUID(user.getUserUUID());
            loginResponseDto.setUserId(user.getUserId());
            loginResponseDto.setUserNickname(user.getUserNickname());
            loginResponseDto.setUserPassword(user.getUserPassword());
            loginResponseDto.setUserEmail(user.getUserEmail());
            return loginResponseDto;

        }
        throw new InvalidLoginRequest();
    }
}
