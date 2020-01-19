package com.tgh.exam.service;

import com.tgh.exam.domain.UserTest;

import java.util.List;

public interface UserService {

    List<UserTest> getAllUser();
    void insert(UserTest userTest);

}
