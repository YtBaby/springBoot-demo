package com.example.mine.service.impl;

import com.example.mine.domain.User;
import com.example.mine.repository.UserRepository;
import com.example.mine.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findByNameAndPwd(String name, String pwd) {
        User u = userRepository.findByUserName(name,pwd);
        if(null != u){
            return u;
        }
        return new User();
    }
}
