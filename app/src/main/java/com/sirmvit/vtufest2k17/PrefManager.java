package com.sirmvit.vtufest2k17;

import android.content.Context;
import android.content.SharedPreferences;

class PrefManager {
    private SharedPreferences mSharedPreferences;

    private String isFirstTimeLaunch = "FirstTime";

    PrefManager(Context context) {
        mSharedPreferences = context.getSharedPreferences("InitLaunchPreference",Context.MODE_PRIVATE);
    }

    void setFirstTimeLaunch(boolean isFirstTime) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.clear();
        editor.putBoolean(isFirstTimeLaunch,isFirstTime);
        editor.apply();
    }

    boolean isFirstTimeLaunch() {
        boolean val = false;
        if(mSharedPreferences.getBoolean(isFirstTimeLaunch,true)) {
            val = true;
        }
        return val;
    }
}
