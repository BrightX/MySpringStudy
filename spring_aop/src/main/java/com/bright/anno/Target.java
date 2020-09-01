package com.bright.anno;

import org.springframework.stereotype.Component;

/**
 * @author 徐亮亮
 * @date 2020/8/24
 */
@Component("target")
public class Target implements TargetInterface {
    @Override
    public void save() {
        System.out.println("Target is saving...");
        // int a = 5/6;
        // int b = 2 / a;
    }
}
