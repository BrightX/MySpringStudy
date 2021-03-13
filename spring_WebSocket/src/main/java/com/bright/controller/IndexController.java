package com.bright.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 徐亮亮
 * @since 2021/1/9
 */
@Controller
public class IndexController {
    @RequestMapping("/chat")
    public String index() {
        return "chat";
    }
}
