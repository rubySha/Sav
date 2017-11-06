package com.sav.controller;

import com.blade.ioc.annotation.Inject;
import com.blade.mvc.annotation.Param;
import com.blade.mvc.annotation.Route;
import com.blade.mvc.http.HttpMethod;
import com.sav.model.User;
import com.sav.service.UserService;

/**
 * Created by Sha on 2017/10/26.
 */
public class LoginController {

    @Inject
    private UserService userService;

    //登录
    @Route(value = "/login", method = HttpMethod.POST)
    public boolean login(@Param String loginName,@Param String password){
        User loginuser = userService.checkLogin(loginName,password);
        if(loginuser == null){
            return false;
        }else{
            if (loginuser.getAuth().equals(1)){
                return true;
            }else {
                return false;
            }
        }
    }
    //注册用户
    public boolean registeredUser(@Param User user){
        return true;
    }

}
