package com.dou.demo.aop_demo;

import android.Manifest;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fuck();

        time_consumer();

        openCamera();
    }

    @PermissionChecker(permission = Manifest.permission.CAMERA)
    private void openCamera() {
        System.out.println("open camera");
    }

    @Hugo
    private void time_consumer() {
        for (int i = 0; i < 100; i++){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Hugo
    public void test(View view) {
        System.out.println("onclick");
    }

    @Hugo
    public void fuck() {
        System.out.println("fuck");
    }
}
