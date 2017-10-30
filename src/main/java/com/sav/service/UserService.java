package com.sav.service;

import com.sav.model.User;

/**
 * Created by Sha on 2017/10/30.
 */
public interface UserService {
    User checkLogin(String loginName, String password);
}
