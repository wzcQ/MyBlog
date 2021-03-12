package com.wz.service;

import com.wz.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
