package com.iamwee.basicmvp;

import android.app.Application;

/**
 * Created by zeon on 6/22/2017 AD.
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Contextor.getInstance().setContext(getApplicationContext());
    }
}
