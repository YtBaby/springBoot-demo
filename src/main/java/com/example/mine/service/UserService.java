package com.example.mine.service;

import com.example.mine.domain.User;

public interface UserService {

    User findByNameAndPwd(String name,String pwd);
}
