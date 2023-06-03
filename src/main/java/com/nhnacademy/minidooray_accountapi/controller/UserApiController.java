package com.nhnacademy.minidooray_accountapi.controller;

import com.nhnacademy.minidooray_accountapi.dto.LoginRequestDto;
import com.nhnacademy.minidooray_accountapi.dto.LoginResponseDto;
import com.nhnacademy.minidooray_accountapi.dto.SignUpRequestDto;
import com.nhnacademy.minidooray_accountapi.dto.UserInfoDto;
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
    public ResponseEntity<String> postApiSignup(@RequestBody SignUpRequestDto signUpRequestDto) {
        userService.createUser(signUpRequestDto);
        return ResponseEntity.ok("Sign up success.");
    }

    @GetMapping("/userInfo/{userUUID}")
    public ResponseEntity<UserInfoDto> getApiUsers(@PathVariable String userUUID) {
        UserInfoDto userInfoDto = userService.getUser(userUUID);
        return ResponseEntity.ok(userInfoDto);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> postApiLogin(@RequestBody LoginRequestDto loginRequestDto) {
        LoginResponseDto loginResponseDto = userService.login(loginRequestDto);
        return ResponseEntity.ok(loginResponseDto);
    }

    @DeleteMapping("/user/{userUUID}")
    public ResponseEntity<String> deleteApiUser(@PathVariable String userUUID) {
        userService.deleteUser(userUUID);
        return ResponseEntity.ok("Delete success.");
    }
    
//    @PutMapping("/user")
//    public ResponseEntity<String> updateApiUser(@RequestBody SignUpRequestDto signUpRequestDto) {
//        userService.updateUser(signUpRequestDto);
//        return ResponseEntity.ok("Update success.");
//    }


}
