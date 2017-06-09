package com.pengdf.web.demo.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pengdf.web.demo.dao.user.IUserDao;
import com.pengdf.web.demo.service.user.IUserService;
import com.pengdf.web.demo.user.user.UserVO;


@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDao userDao;

    @Override
    public void addUser(UserVO user) throws Exception{
        userDao.addUser(user);
    }
}