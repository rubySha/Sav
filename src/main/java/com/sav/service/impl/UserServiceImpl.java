package com.sav.service.impl;

import com.sav.model.User;
import com.sav.service.UserService;

/**
 * Created by Sha on 2017/10/30.
 */
public class UserServiceImpl implements UserService{

    @Override
    public User checkLogin(String loginName, String password){
        User user = new User();
        User loginUser = user.query("select * from user where LOGIN_NAME = ? AND PASSWORD=?",loginName,password);
        return loginUser;
    }

    @Override
    public int insertUser(User user){
        User sql = new User();
        User loginUser = user.query("",user);
        return 1;
    }
}
