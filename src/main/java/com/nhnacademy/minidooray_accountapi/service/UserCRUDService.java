package com.nhnacademy.minidooray_accountapi.service;

import com.nhnacademy.minidooray_accountapi.dto.*;
import com.nhnacademy.minidooray_accountapi.entity.User;
import com.nhnacademy.minidooray_accountapi.exception.InvalidLoginRequest;
import com.nhnacademy.minidooray_accountapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserCRUDService {
    UserRepository userRepository;

    public UserCRUDService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    public LoginResponseDto login(LoginRequestDto loginRequestDto) {
//        List<User> users = userRepository.findByUserId(loginRequestDto.getUserId());
//
//        for (User user : users) {
//            LoginResponseDto loginResponseDto = new LoginResponseDto();
//            loginResponseDto.setUserUUID(user.getUserUUID());
//            loginResponseDto.setUserId(user.getUserId());
//            loginResponseDto.setUserNickName(user.getUserNickName());
//            loginResponseDto.setUserPassword(user.getUserPassword());
//            loginResponseDto.setUserEmail(user.getUserEmail());
//            return loginResponseDto;
//
//        }
//        throw new InvalidLoginRequest();
//    }

    public UserInfoDto getUser(String userUUID) {
        User user = userRepository.findById(userUUID).orElseThrow(InvalidLoginRequest::new);
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setUserUUID(user.getUserUUID());
        userInfoDto.setUserId(user.getUserId());
        userInfoDto.setUserNickname(user.getUserNickname());
        //#TODO 유저 데이터베이스에 이메일 필요할듯합니다?
//        userInfoDto.setUserEmail(user.getUserEmail());
        return userInfoDto;
    }

    public UserRegisterAccountApiDto createUser(SignUpRequestDto signUpRequestDto) {
        User user = new User();
        user.setUserUUID(UUID.randomUUID().toString());
        user.setUserId(signUpRequestDto.getUserId());
        user.setUserPassword(signUpRequestDto.getPassword());
        user.setUserNickname(signUpRequestDto.getUserNickName());
        user.setUserEmail(signUpRequestDto.getUserEmail());
        userRepository.save(user);

        UserRegisterAccountApiDto userRegisterAccountApiDto = new UserRegisterAccountApiDto();
        userRegisterAccountApiDto.setUserUUID(user.getUserUUID());
        userRegisterAccountApiDto.setUserId(user.getUserId());
        userRegisterAccountApiDto.setUserNickName(user.getUserNickname());
        userRegisterAccountApiDto.setUserEmail(user.getUserEmail());

        return userRegisterAccountApiDto;
    }

    public void deleteUser(String userUUID) {
        userRepository.deleteById(userUUID);
    }

    public UserUpdateResponseDto updateUser(String userUUID, SignUpRequestDto signUpRequestDto) {
        User user = userRepository.findById(userUUID).orElseThrow(InvalidLoginRequest::new);
        user.setUserId(signUpRequestDto.getUserId());
        user.setUserPassword(signUpRequestDto.getPassword());
        user.setUserNickname(signUpRequestDto.getUserNickName());
        user.setUserEmail(signUpRequestDto.getUserEmail());
        userRepository.save(user);

        UserUpdateResponseDto userUpdateResponseDto = new UserUpdateResponseDto();
        userUpdateResponseDto.setUserId(user.getUserId());
        userUpdateResponseDto.setUserNickname(user.getUserPassword());
        userUpdateResponseDto.setUserEmail(user.getUserEmail());
        return userUpdateResponseDto;
    }
}
