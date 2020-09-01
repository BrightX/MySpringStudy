package com.bright.study01.controller;

import com.bright.study01.service.SomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {
    private final SomeService someService;

    public SomeController(SomeService someService) {
        this.someService = someService;
    }

    @GetMapping("/")
    public String index() {
        return "这里是首页";
    }

    @GetMapping("/some")
    public String someHandler() {

        return someService.hello();
    }
}
