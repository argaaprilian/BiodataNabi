package com.arga.biodatanabi;

import android.app.Application;

import com.azhar.biodatanabi.utils.PreferencesApp;


public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        PreferencesApp.initPreferences(this);
    }
}
