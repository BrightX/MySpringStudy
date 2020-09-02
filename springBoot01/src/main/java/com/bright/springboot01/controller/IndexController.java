package com.bright.springboot01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 徐亮亮
 * @date 2020/9/2
 */
@Controller
public class IndexController {

    /**
     * 首页
     * @return String
     */
    @RequestMapping(value = {"/", "/index", "/home"})
    public String index(String msg, Model model){
        model.addAttribute("msg", msg);
        return "index";
    }

    @RequestMapping(value = {"/manage"})
    public String manage() {
        return "manage";
    }
}
