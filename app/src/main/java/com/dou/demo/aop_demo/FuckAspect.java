package com.dou.demo.aop_demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Author: dou
 * Time: 18-8-31  下午3:57
 * Decription:
 */
@Aspect
public class FuckAspect {

    @Pointcut("execution(* com.dou.demo.aop_demo.MainActivity.fuck(..))")
    public void pointcut(){}

    @Around("pointcut()")
    public void fuck(ProceedingJoinPoint point) throws Throwable{
        System.out.println("@fuck start");
        point.proceed();
        System.out.println("@fuck end");
    }
}
