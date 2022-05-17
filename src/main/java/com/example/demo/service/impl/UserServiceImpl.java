package com.example.demo.service.impl;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author xulin
 */
@Service
public class UserServiceImpl implements UserService{
    @Override
    public User getUserInfo(){
        User user = new User();
        user.setName("jack");
        user.setPassword(1234);
        return user;
    }
}
