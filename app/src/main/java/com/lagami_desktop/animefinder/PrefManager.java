package com.lagami_desktop.animefinder;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Lagami-Desktop on 2017-04-29.
 */

public class PrefManager {
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    Context mContext;

    private static final String pref_name = "animefinder";
    private static final String ACCESS_TOKEN = "access_token";

    public PrefManager(Context context) {
        this.mContext = context;
        preferences = mContext.getSharedPreferences(pref_name, Context.MODE_PRIVATE);
    }

    public void setAccessToken(String token) {
        editor = preferences.edit();
        editor.putString(ACCESS_TOKEN, token);
        editor.commit();
    }

    public String getAccessToken() {
        return preferences.getString(ACCESS_TOKEN, "default");
    }
}
