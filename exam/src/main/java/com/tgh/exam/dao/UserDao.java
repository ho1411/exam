package com.tgh.exam.dao;

import com.tgh.exam.domain.UserTest;

import java.util.List;

public interface UserDao {

    List<UserTest> getAllUser();
    void insert(UserTest userTest);
}
