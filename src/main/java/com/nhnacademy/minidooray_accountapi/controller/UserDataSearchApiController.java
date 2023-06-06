package com.nhnacademy.minidooray_accountapi.controller;

import com.nhnacademy.minidooray_accountapi.dto.UserDataSearchDto;
import com.nhnacademy.minidooray_accountapi.service.UserDataSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/userdata")
public class UserDataSearchApiController {
    private final UserDataSearchService userDataSearchService;

    @GetMapping("/")
    public List<UserDataSearchDto> getAllUserData() {
        return userDataSearchService.getAllUserData();
    }

    @GetMapping("/{id}")
    public UserDataSearchDto getUserDataById(String userId) {
        return userDataSearchService.getUserDataByUserId(userId);
    }

    @PutMapping("/{id}")
    public void updateUserDataById(String userId, UserDataSearchDto userDataSearchDto) {
        userDataSearchService.updateUserDataByUserId(userId, userDataSearchDto);
    }

    @DeleteMapping("/{id}")
    public void deleteUserDataById(String userId) {
        userDataSearchService.deleteUserDataByUserId(userId);
    }

}
