package com.iamwee.basicmvp;

import android.content.Context;

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
}
