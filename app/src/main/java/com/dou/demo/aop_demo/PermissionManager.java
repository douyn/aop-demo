package com.dou.demo.aop_demo;

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.content.ContextCompat;

/**
 * Author: dou
 * Time: 18-8-31  下午4:11
 * Decription:
 */

public class PermissionManager {
    public static boolean checkPermission(Context context, String permission) {
        PackageManager pm = context.getPackageManager();

        return ContextCompat.checkSelfPermission(context, permission) == PackageManager.PERMISSION_GRANTED;
    }
}
