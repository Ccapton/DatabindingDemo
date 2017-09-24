package com.example.capton.databindingdemo;

import android.content.Context;

/**
 * Created by CAPTON on 2017/9/24.
 */

public class ContextUtil {
    private static Context sContext;
    private static ContextUtil instance;
    public static void init(Context context){
        sContext=context;
        if(instance==null)
            instance=new ContextUtil();
    }

    public static ContextUtil getInstance(){
        return instance;
    }

    public  Context getAppContext(){
        return sContext;
    }
}
