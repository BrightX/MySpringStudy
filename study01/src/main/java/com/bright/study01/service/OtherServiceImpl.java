package com.bright.study01.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class OtherServiceImpl implements SomeService {
    @Override
    public String hello() {
        return "这里是 (dev) 开发环境";
    }
}
