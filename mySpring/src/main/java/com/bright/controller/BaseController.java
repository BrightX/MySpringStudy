package com.bright.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class BaseController {

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index0", "msg", "这里是首页");
    }


    @GetMapping("/index")
    public ModelAndView index0() {
        return index();
    }

    @GetMapping("/hello")
    public String hello() {
        return "你好啊";
    }

    @GetMapping("/test")
    public void test(HttpServletResponse response) throws IOException {
        response.sendRedirect("/index?from=test");
    }
}
