package com.nhnacademy.minidooray_accountapi.controller;

import com.nhnacademy.minidooray_accountapi.dto.LoginRequestDto;
import com.nhnacademy.minidooray_accountapi.dto.LoginResponseDto;
import com.nhnacademy.minidooray_accountapi.service.UserLoginServce;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/account")
public class UserLoginApiController {

    private final UserLoginServce userLoginService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> postApiLogin(@RequestBody LoginRequestDto loginRequestDto) {
        LoginResponseDto loginResponseDto = userLoginService.login(loginRequestDto);
        return ResponseEntity.ok(loginResponseDto);
    }

    @GetMapping("/login/{userId}")
    public ResponseEntity<LoginResponseDto> postApiLogin(@PathVariable String userId) {
        LoginRequestDto loginRequestDto = new LoginRequestDto();
        loginRequestDto.setUserId(userId);
        LoginResponseDto loginResponseDto = userLoginService.login(loginRequestDto);
        return ResponseEntity.ok(loginResponseDto);
    }
}
