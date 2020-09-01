package com.bright.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author 徐亮亮
 * @date 2020/8/24
 */
@Component("myAspect")
@Aspect  // 标注当前类是切面类
public class MyAspect {

    // 配置前置通知
    @Before("execution(* com.bright.anno.*.*(..))")
    public void before() {
        System.out.println("前置增强。。。");
    }

    @AfterReturning("execution(* com.bright.anno.*.*(..))")
    public void afterReturning() {
        System.out.println("后置增强。。。");
    }

    @Around("execution(* com.bright.anno.*.*(..))")
    // Proceeding JoinPoint  正在执行的连接点 ==> 切点
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕前通知。。。");
        Object proceed = point.proceed();  // 切点方法
        System.out.println("环绕后通知。。。");
        return proceed;
    }

    @AfterThrowing("execution(* com.bright.anno.*.*(..))")
    public void afterThrowing() {
        System.out.println("异常抛出通知。。。");
    }

    // @After("execution(* com.bright.anno.*.*(..))")
    @After("MyAspect.pointcut()")  // 抽取切点表达式
    public void after() {
        // 抛不抛异常都会执行
        System.out.println("最终增强。。。");
    }

    @Pointcut("execution(* com.bright.anno.*.*(..))")
    // 定义切点表达式
    public void pointcut() {
    }

}
