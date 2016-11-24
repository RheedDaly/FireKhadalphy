package com.thetechaupair.firekhadalphy;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Rheed on 11/23/2016.
 */

public class FireKhadalphy extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
