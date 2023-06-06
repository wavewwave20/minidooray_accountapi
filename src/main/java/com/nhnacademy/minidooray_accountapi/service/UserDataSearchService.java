package com.nhnacademy.minidooray_accountapi.service;

import com.nhnacademy.minidooray_accountapi.dto.UserDataSearchDto;
import com.nhnacademy.minidooray_accountapi.entity.User;
import com.nhnacademy.minidooray_accountapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDataSearchService {
    private final UserRepository userRepository;

    public List<UserDataSearchDto> getAllUserData() {
        List<User> users = userRepository.findAll();

        List<UserDataSearchDto> result = new ArrayList<>();
        for (User user : users) {
            UserDataSearchDto dto = new UserDataSearchDto();
            dto.setUserId(user.getUserId());
            dto.setUserNickName(user.getUserNickname());
            dto.setUserEmail(user.getUserEmail());
            result.add(dto);
        }

        return result;
    }


    public UserDataSearchDto getUserData(String userId) {
        List<User> users = userRepository.findByUserId(userId);;

        UserDataSearchDto result = new UserDataSearchDto();
        if (!users.isEmpty()) {
            User user = users.get(0);
            result.setUserId(user.getUserId());
            result.setUserNickName(user.getUserNickname());
            result.setUserEmail(user.getUserEmail());
        }

        return result;
    }


//    public void updateUserDataByUserId(String userId, UserDataSearchDto userDataSearchDto) {
//        userRepository.updateUserDataByUserId(userId, userDataSearchDto);
//    }

    public void deleteUserDataByUserId(String userId) {
        userRepository.deleteUserDataByUserId(userId);
    }
}
