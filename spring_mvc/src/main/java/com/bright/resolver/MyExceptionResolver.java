package com.bright.resolver;

import com.bright.exception.MyException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author 徐亮亮
 * @date 2020/8/27
 */
public class MyExceptionResolver implements HandlerExceptionResolver {

    /*
       参数 Exception 异常对象
       返回 ModelAndView 跳转到异常视图页面
     */
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        ModelAndView modelAndView = new ModelAndView();
        if (ex instanceof MyException) {
            modelAndView.addObject("info", "自定义异常");
        }
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
