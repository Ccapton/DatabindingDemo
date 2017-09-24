package com.example.capton.databindingdemo;

import android.app.Application;

/**
 * Created by CAPTON on 2017/9/24.
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ContextUtil.init(this);
    }
}
