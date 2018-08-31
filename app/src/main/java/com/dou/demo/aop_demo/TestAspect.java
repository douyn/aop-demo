package com.dou.demo.aop_demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Author: dou
 * Time: 18-8-31  下午3:55
 * Decription:
 */

@Aspect
public class TestAspect {

    @Pointcut("execution(* com.dou.demo.aop_demo.MainActivity.test(..))")
    public void pointcut(){}

    @Around("pointcut()")
    public void test(ProceedingJoinPoint point) throws Throwable{
        System.out.println("@test start");
        point.proceed();
        System.out.println("@test end");
    }
}
