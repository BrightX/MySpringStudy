package com.bright.controller;

import com.alibaba.fastjson.JSON;
import com.bright.domain.User;
import com.bright.domain.VO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * @author 徐亮亮
 * @date 2020/8/25
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/quick", method = RequestMethod.GET)//, params = {"username"})
    public String save() {
        System.out.println("Controller`s save is running...");
        return "success";  // 转发 `forward:` 可以省略
    }

    @RequestMapping(value = "/quick2")
    public ModelAndView save2() {
        /*
            Model: 模型 封装数据
            View: 视图 展示数据
         */
        ModelAndView modelAndView = new ModelAndView();
        // 设置视图
        modelAndView.setViewName("index");
        // 设置模型数据
        modelAndView.addObject("username", "admin");
        return modelAndView;
    }

    @RequestMapping(value = "/quick3")
    public ModelAndView save3(ModelAndView modelAndView) {
        // 设置视图
        modelAndView.setViewName("index");
        // 设置模型数据
        modelAndView.addObject("username", "admin3");
        return modelAndView;
    }

    @RequestMapping(value = "/quick4")
    public String save4(Model model) {
        model.addAttribute("username", "admin4");
        return "index";
    }

    @RequestMapping(value = "/quick5")
    public String save5(HttpServletRequest request) {  // 不常用
        request.setAttribute("username", "管理员");
        return "index";
    }

    @RequestMapping(value = "/quick6")
    public void save6(HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write("你好 ==> Hello~~!!!");
    }

    @RequestMapping(value = "/quick7")
    @ResponseBody  // 告知SpringMVC 框架该方法不进行视图跳转 直接进行数据响应
    public String save7() {
        return "你好 ==> Hello~~!!!";
    }

    @RequestMapping(value = "/quick8")
    @ResponseBody
    public String save8() {  // 直接回写json
        return "{\"name\": \"Tom\", \"age\": 18}";
    }

    @RequestMapping(value = "/quick9")
    @ResponseBody
    public String save9() {
        User user = new User();
        user.setUsername("Jame");
        user.setAge(21);
        // 使用JSON转换工具将对象转换成json格式字符串
        return JSON.toJSONString(user);
    }

    @RequestMapping(value = "/quick10")
    @ResponseBody
    public User save10() {
        return new User("Maria 玛丽亚", 22);
    }

    @RequestMapping(value = "/quick11")
    @ResponseBody
    public void save11(String username, int age) {
        // 获取简单参数  /user/quick11?username=玛丽亚&age=21
        System.out.println("username = " + username);
        System.out.println("age = " + age);
    }

    @RequestMapping(value = "/quick12")
    @ResponseBody
    public User save12(User user) {
        // 获取POJO类型参数  /user/quick12?username=玛丽亚&age=21
        System.out.println("user = " + user);
        return user;
    }

    @RequestMapping(value = "/quick13")
    @ResponseBody
    public String[] save13(String[] str) {
        // 获取数组类型参数  /user/quick13?str=111&str=222&str=333&str=abc
        System.out.println("str = " + Arrays.asList(str));
        return str;
    }

    @RequestMapping(value = "/quick14")
    @ResponseBody
    public VO save14(VO vo) {
        // 获取集合类型参数  /user/quick13?str=111&str=222&str=333&str=abc
        // 获得集合参数时，要将集合参数包装到一个POJO中才可以。 ==> VO对象
        System.out.println("vo = " + vo);
        return vo;
    }

    @RequestMapping(value = "/quick15")
    @ResponseBody
    public List<User> save15(@RequestBody List<User> userList) {
        System.out.println("userList = " + userList);
        return userList;
    }

    @RequestMapping(value = "/r")
    public String redirect() {
        System.out.println("请求转发。。。");
        return "redirect:/user/quick";  // 302 重定向
    }
}
