package com.iamwee.basicmvp;

import android.content.Context;
import android.os.Handler;

/**
 * Created by zeon on 6/22/2017 AD.
 */

class MainModel {

    public String getStringResource(int id) {
        return Contextor.getInstance().getContext().getString(id);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public void getData(final Callback callback){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                callback.onResponse("Hello, world naja");
            }
        }, 5000);
    }

    public interface Callback {
        void onResponse(String result);
    }
}
