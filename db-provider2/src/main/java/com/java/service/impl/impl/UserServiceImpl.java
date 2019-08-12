package com.java.service.impl.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.java.commons.api.UserService;

import java.util.Arrays;
import java.util.List;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {
    @Override
    public List<String> getUsers() {
        return Arrays.asList("provider222","bbb");
    }
}
