package com.example.service.impl;

import com.example.bean.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> selectAllUser() {
        return userMapper.selectAllUser();
    }
}
