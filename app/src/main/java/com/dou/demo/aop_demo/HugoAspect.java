package com.dou.demo.aop_demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * Author: dou
 * Time: 18-8-31  下午3:51
 * Decription:
 */
@Aspect
public class HugoAspect {
    @Pointcut("execution(@com.dou.demo.aop_demo.Hugo * *(..))")
    public void hugo(){}

    @Around("hugo()")
    public void timer(ProceedingJoinPoint point) throws Throwable{
        System.out.println("@hugo start");
        MethodSignature signature = (MethodSignature) point.getSignature();
        long starttime = System.currentTimeMillis();
        point.proceed();
        long endtime = System.currentTimeMillis();
        System.out.println(signature.getMethod().getName() + " 方法耗时： " + (endtime - starttime) + " ms");
        System.out.println("@hugo end");
    }
}
