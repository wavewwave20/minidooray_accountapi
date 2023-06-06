package com.nhnacademy.minidooray_accountapi.service;

import com.nhnacademy.minidooray_accountapi.dto.UserDataSearchDto;
import com.nhnacademy.minidooray_accountapi.entity.User;
import com.nhnacademy.minidooray_accountapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDataSearchService {
    private final UserRepository userRepository;

    public List<UserDataSearchDto> getAllUserData() {
        return userRepository.findAllUser();
    }

    public UserDataSearchDto getUserDataByUserId(String userId) {
        return userRepository.findUserDataByUserId(userId);
    }

    public void updateUserDataByUserId(String userId, UserDataSearchDto userDataSearchDto) {
        userRepository.updateUserDataByUserId(userId, userDataSearchDto);
    }

    public void deleteUserDataByUserId(String userId) {
        userRepository.deleteUserDataByUserId(userId);
    }
}
