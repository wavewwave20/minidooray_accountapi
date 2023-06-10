package com.nhnacademy.minidooray_accountapi.controller;

import com.nhnacademy.minidooray_accountapi.dto.*;
import com.nhnacademy.minidooray_accountapi.service.UserCRUDService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accountapi")
public class UserCRUDApiController {
    private final UserCRUDService userCRUDService;

    public UserCRUDApiController(UserCRUDService userCRUDService) {
        this.userCRUDService = userCRUDService;
    }

    @PostMapping("/signup")
    public ResponseEntity<UserRegisterAccountApiDto> postApiSignup(@RequestBody SignUpRequestDto signUpRequestDto) {
        UserRegisterAccountApiDto result = userCRUDService.createUser(signUpRequestDto);

        return ResponseEntity.status(201).body(result);
    }

    @GetMapping("/userInfo/{userUUID}")
    public ResponseEntity<UserInfoDto> getApiUsers(@PathVariable String userUUID) {
        UserInfoDto userInfoDto = userCRUDService.getUser(userUUID);
        return ResponseEntity.ok(userInfoDto);
    }

//    @PostMapping("/login")
//    public ResponseEntity<LoginResponseDto> postApiLogin(@RequestBody LoginRequestDto loginRequestDto) {
//        LoginResponseDto loginResponseDto = userService.login(loginRequestDto);
//        return ResponseEntity.ok(loginResponseDto);
//    }
//
//    @GetMapping("/login/{userId}")
//    public ResponseEntity<LoginResponseDto> postApiLogin(@PathVariable String userId) {
//        LoginRequestDto loginRequestDto = new LoginRequestDto();
//        loginRequestDto.setUserId(userId);
//        LoginResponseDto loginResponseDto = userService.login(loginRequestDto);
//        return ResponseEntity.ok(loginResponseDto);
//    }

    @DeleteMapping("/user/{userUUID}")
    public ResponseEntity<String> deleteApiUser(@PathVariable String userUUID) {
        userCRUDService.deleteUser(userUUID);
        return ResponseEntity.ok("Delete success.");
    }

    @PutMapping("/user/{userUUID}")
    public ResponseEntity<UserUpdateResponseDto> updateApiUser(@PathVariable String userUUID, @RequestBody SignUpRequestDto signUpRequestDto) {
        UserUpdateResponseDto userUpdateResponseDto = userCRUDService.updateUser(userUUID, signUpRequestDto);
        return ResponseEntity.ok(userUpdateResponseDto);
    }

//    @PutMapping("/user")
//    public ResponseEntity<String> updateApiUser(@RequestBody SignUpRequestDto signUpRequestDto) {
//        userService.updateUser(signUpRequestDto);
//        return ResponseEntity.ok("Update success.");
//    }


}
