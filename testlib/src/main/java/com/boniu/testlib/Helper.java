package com.boniu.testlib;

import android.content.Context;

import com.bun.miitmdid.core.JLibrary;

public class Helper {

    public static  void init(Context context){
        try {
            JLibrary.InitEntry(context);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
