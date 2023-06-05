package com.nhnacademy.minidooray_accountapi.service;

import com.nhnacademy.minidooray_accountapi.dto.LoginRequestDto;
import com.nhnacademy.minidooray_accountapi.dto.LoginResponseDto;
import com.nhnacademy.minidooray_accountapi.dto.SignUpRequestDto;
import com.nhnacademy.minidooray_accountapi.dto.UserInfoDto;
import com.nhnacademy.minidooray_accountapi.entity.User;
import com.nhnacademy.minidooray_accountapi.exception.InvalidLoginRequest;
import com.nhnacademy.minidooray_accountapi.repository.UserRepository;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public LoginResponseDto login(LoginRequestDto loginRequestDto) {
        List<User> users = userRepository.findByUserId(loginRequestDto.getUserId());

        for(User user : users) {
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

    public UserInfoDto getUser(String userUUID) {
        User user = userRepository.findById(userUUID).orElseThrow(InvalidLoginRequest::new);
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setUserUUID(user.getUserUUID());
        userInfoDto.setUserId(user.getUserId());
        userInfoDto.setUserNickname(user.getUserNickname());
        userInfoDto.setUserEmail(user.getUserEmail());
        return userInfoDto;
    }

    public void createUser(SignUpRequestDto signUpRequestDto) {
        User user = new User();
        user.setUserUUID(UUID.randomUUID().toString());
        user.setUserId(signUpRequestDto.getUserId());
        user.setUserPassword(signUpRequestDto.getPassword());
        user.setUserNickname(signUpRequestDto.getUserNickName());
        user.setUserEmail(signUpRequestDto.getUserEmail());
        userRepository.save(user);
    }

    public void deleteUser(String userUUID) {
        userRepository.deleteById(userUUID);
    }

    public void updateUser(UserInfoDto userInfoDto) {
        User user = userRepository.findById(userInfoDto.getUserUUID()).orElseThrow(InvalidLoginRequest::new);
        user.setUserId(userInfoDto.getUserId());
        user.setUserNickname(userInfoDto.getUserNickname());
        user.setUserEmail(userInfoDto.getUserEmail());
        userRepository.save(user);
    }
}
