package com.bright.service.Impl;

import com.bright.service.MyService;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {
    @Override
    public String hello() {
        return "这里是首页";
    }
}
