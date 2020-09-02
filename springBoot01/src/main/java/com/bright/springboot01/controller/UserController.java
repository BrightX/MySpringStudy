package com.bright.springboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 徐亮亮
 * @date 2020/9/2
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/tell")
    @ResponseBody
    public String tell(String msg) {
        return "Your message is: " + msg;
    }
}
