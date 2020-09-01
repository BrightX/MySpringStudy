package com.bright.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 徐亮亮
 * @date 2020/8/24
 *
 * 基于JDK的动态代理
 */
public class ProxyTest {

    public static void main(String[] args) {

        final Advice advice = new Advice();

        final Target target = new Target();

        // 返回值 是动态生成的代理对象
        TargetInterface proxyInstance = (TargetInterface) Proxy.newProxyInstance(
                // 目标对象类加载器
                target.getClass().getClassLoader(),
                // 目标对象相同的接口字节码对象数组
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    // 调用代理对象的任何方法 实质执行的都是invoke方法
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 前置增强
                        advice.before();
                        // 执行目标方法
                        Object invoke = method.invoke(target, args);
                        // 后置增强
                        advice.afterReturning();
                        return invoke;
                    }
                }
        );

        proxyInstance.save();
    }

}
