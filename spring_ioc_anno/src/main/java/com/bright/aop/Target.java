package com.bright.aop;

/**
 * @author 徐亮亮
 * @date 2020/8/24
 */
public class Target implements TargetInterface {
    @Override
    public void save() {
        System.out.println("Target is saving...");
        // int a = 0;
        // int b = 2 / a;
    }
}
