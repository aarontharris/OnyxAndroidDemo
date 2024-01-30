package com.android.onyx.demo;

import android.app.Application;
import android.content.Context;
import android.os.Build;

import com.onyx.android.sdk.rx.RxManager;

import org.lsposed.hiddenapibypass.HiddenApiBypass;

/**
 * Created by suicheng on 2017/3/23.
 */

public class SampleApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        RxManager.Builder.initAppContext(this);
        checkHiddenApiBypass();
    }

    private void checkHiddenApiBypass() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            HiddenApiBypass.addHiddenApiExemptions("");
        }
    }
}
