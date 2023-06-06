package com.nhnacademy.minidooray_accountapi.repository;

import com.nhnacademy.minidooray_accountapi.dto.UserDataSearchDto;
import com.nhnacademy.minidooray_accountapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

    public List<User> findByUserId(String userId);

    List<User> findAll();


    UserDataSearchDto findUserDataByUserId(String userId);

//    void updateUserDataByUserId(String userId, UserDataSearchDto userDataSearchDto);

    void deleteUserDataByUserId(String userId);
}
