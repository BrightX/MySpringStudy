package com.bright.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 徐亮亮
 * @date 2020/8/24
 */
public class ProxyTest {
    public static void main(String[] args) {
        // 目标对象
        final Target target = new Target();
        // 增强对象
        final Advice advice = new Advice();

        // 返回值 是动态生成的代理对象 基于cglib
        // 1. 创建增强器
        Enhancer enhancer = new Enhancer();
        // 2. 设置目标父类
        enhancer.setSuperclass(Target.class);
        // 3. 设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                // 前置增强
                advice.before();
                // 执行目标方法
                Object invoke = method.invoke(target, args);
                // 后置增强
                advice.afterReturning();
                return invoke;
            }
        });

        // 4. 创建代理对象
        Target proxy = (Target) enhancer.create();

        proxy.save();
    }
}
