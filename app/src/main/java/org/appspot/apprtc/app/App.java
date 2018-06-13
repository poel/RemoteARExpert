package org.appspot.apprtc.app;

import android.app.Application;

import org.appspot.apprtc.util.Utils;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Utils.init(this);
    }
}
