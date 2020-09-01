package com.bright.study01;

import com.bright.study01.service.SomeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Study01ApplicationTests {

    @Autowired
    private SomeService someService;

    @Test
    void contextLoads() {
        System.out.println(someService.hello());
    }

}
