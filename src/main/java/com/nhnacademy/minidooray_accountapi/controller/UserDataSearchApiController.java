package com.nhnacademy.minidooray_accountapi.controller;

import com.nhnacademy.minidooray_accountapi.dto.UserDataSearchDto;
import com.nhnacademy.minidooray_accountapi.service.UserDataSearchService;
import lombok.RequiredArgsConstructor;
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

    @GetMapping("/{userId}")
    public UserDataSearchDto getUserDataByUserId(@PathVariable String userId) {
        return userDataSearchService.getUserData(userId);
    }

    //#TODO: updateUserDataById() 구현

//    @PutMapping("/{id}")
//    public void updateUserDataById(String userId, UserDataSearchDto userDataSearchDto) {
//        userDataSearchService.updateUserDataByUserId(userId, userDataSearchDto);
//    }

    @DeleteMapping("/{userId}")
    public void deleteUserDataById(@PathVariable String userId) {
        userDataSearchService.deleteUserDataByUserId(userId);
    }

}
