package com.nhnacademy.minidooray_accountapi.controller;

import com.nhnacademy.minidooray_accountapi.dto.UserDataSearchDto;
import com.nhnacademy.minidooray_accountapi.service.UserDataSearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/account")
public class UserDataSearchApiController {
    private final UserDataSearchService userDataSearchService;

    @GetMapping("/users/data")
    public List<UserDataSearchDto> getAllUserData() {
        return userDataSearchService.getAllUserData();
    }

    @GetMapping("users/data/{userId}")
    public UserDataSearchDto getUserDataByUserId(@PathVariable String userId) {
        return userDataSearchService.getUserData(userId);
    }

    //#TODO: updateUserDataById() 구현

//    @PutMapping("/{id}")
//    public void updateUserDataById(String userId, UserDataSearchDto userDataSearchDto) {
//        userDataSearchService.updateUserDataByUserId(userId, userDataSearchDto);
//    }

    @DeleteMapping("users/data/{userId}")
    public void deleteUserDataById(@PathVariable String userId) {
        userDataSearchService.deleteUserDataByUserId(userId);
    }

}
