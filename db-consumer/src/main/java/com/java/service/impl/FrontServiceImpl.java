package com.java.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.java.commons.api.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FrontServiceImpl implements com.java.service.FrontService {
    @Reference(version = "1.0.0")
    private UserService userService;

    @Override
    public List<String> findUsers(){
        return userService.getUsers();
    }

}
