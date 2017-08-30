package com.example.sharadsingh.memoryleakfindproject;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by sharadsingh on 30/08/17.
 */

public class ExampleApplication extends Application {

    @Override public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);
        // Normal app init code...
    }
}