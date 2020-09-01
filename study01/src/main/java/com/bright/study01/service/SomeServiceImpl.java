package com.bright.study01.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("pro")
public class SomeServiceImpl implements SomeService {
    @Override
    public String hello() {
        return "这里是 (pro) 生产环境";
    }
}
