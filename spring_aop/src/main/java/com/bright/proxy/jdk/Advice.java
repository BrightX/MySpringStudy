package com.bright.proxy.jdk;

/**
 * @author 徐亮亮
 * @date 2020/8/24
 */
public class Advice {

    public void before(){
        System.out.println("前置增强。。。");
    }

    public void afterReturning() {
        System.out.println("后置增强。。。");
    }
}
