package com.example.mvpdemo;

import android.app.Application;

import cn.finalteam.okhttpfinal.OkHttpFinal;
import cn.finalteam.okhttpfinal.OkHttpFinalConfiguration;

/**
 * @author HaiRun
 * @time 2019/6/4.17:50
 */
public class MvpApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        OkHttpFinalConfiguration.Builder _builder = new OkHttpFinalConfiguration.Builder();
        OkHttpFinal.getInstance().init(_builder.build());
    }
}
