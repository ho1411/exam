package com.tgh.exam.service.impl;

import com.tgh.exam.dao.UserDao;
import com.tgh.exam.domain.UserTest;
import com.tgh.exam.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public List<UserTest> getAllUser() {
        return userDao.getAllUser();
    }

    @Override
    public void insert(UserTest userTest) {
        userDao.insert(userTest);
    }
}
