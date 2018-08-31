package com.dou.demo.aop_demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Author: dou
 * Time: 18-8-31  下午4:05
 * Decription:
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface PermissionChecker {
    String permission();
}
