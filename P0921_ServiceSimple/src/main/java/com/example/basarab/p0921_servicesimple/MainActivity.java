package com.example.basarab.p0921_servicesimple;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    final String LOG_TAG = "myLogs";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }

    public void onClickStart(View v) {
        startService(new Intent(this, MyService.class));
    }

    public void onClickStop(View v) {
        stopService(new Intent(this, MyService.class));
    }
}