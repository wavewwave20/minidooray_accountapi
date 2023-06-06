package com.nhnacademy.minidooray_accountapi.controller;

import com.nhnacademy.minidooray_accountapi.dto.*;
import com.nhnacademy.minidooray_accountapi.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accountapi")
public class UserApiController {
    private final UserService userService;

    public UserApiController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ResponseEntity<UserRegisterAccountApiDto> postApiSignup(@RequestBody SignUpRequestDto signUpRequestDto) {
        UserRegisterAccountApiDto result = userService.createUser(signUpRequestDto);

        return ResponseEntity.status(201).body(result);
    }

    @GetMapping("/userInfo/{userUUID}")
    public ResponseEntity<UserInfoDto> getApiUsers(@PathVariable String userUUID) {
        UserInfoDto userInfoDto = userService.getUser(userUUID);
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
        userService.deleteUser(userUUID);
        return ResponseEntity.ok("Delete success.");
    }

    @PutMapping("/user/{userUUID}")
    public ResponseEntity<String> updateApiUser(@PathVariable String userUUID, @RequestBody SignUpRequestDto signUpRequestDto) {
        userService.updateUser(userUUID, signUpRequestDto);
        return ResponseEntity.ok("Update success.");
    }

//    @PutMapping("/user")
//    public ResponseEntity<String> updateApiUser(@RequestBody SignUpRequestDto signUpRequestDto) {
//        userService.updateUser(signUpRequestDto);
//        return ResponseEntity.ok("Update success.");
//    }


}
