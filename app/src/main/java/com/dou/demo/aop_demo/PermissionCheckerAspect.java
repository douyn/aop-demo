package com.dou.demo.aop_demo;

import android.content.Context;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * Author: dou
 * Time: 18-8-31  下午4:08
 * Decription:
 */

@Aspect
public class PermissionCheckerAspect {

    @Pointcut("execution(@com.dou.demo.aop_demo.PermissionChecker * *(..))")
    public void pointcut(){}

    @Around("pointcut()")
    public void permissionChecker(ProceedingJoinPoint point) throws Throwable{
        Context context = (Context) point.getThis();
        MethodSignature signature = (MethodSignature) point.getSignature();
        PermissionChecker permissionChecker = signature.getMethod().getAnnotation(PermissionChecker.class);
        String permission = permissionChecker.permission();
        boolean havePermission = PermissionManager.checkPermission(context, permission);

        if (havePermission) {
            System.out.println("有权限");
            point.proceed(); 
        }else {
            System.out.println("无权限");
        }
    }
}
