package com.bright.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author 徐亮亮
 * @date 2020/8/24
 */
public class MyAspect {

    public void before() {
        System.out.println("前置增强。。。");
    }

    public void afterReturning() {
        System.out.println("后置增强。。。");
    }

    // Proceeding JoinPoint  正在执行的连接点 ==> 切点
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕前通知。。。");
        Object proceed = point.proceed();  // 切点方法
        System.out.println("环绕后通知。。。");
        return proceed;
    }

    public void afterThrowing() {
        System.out.println("异常抛出通知。。。");
    }

    public void after() {
        // 抛不抛异常都会执行
        System.out.println("最终增强。。。");
    }

}
