package ru.startandroid.p0271_getintentaction;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Info extends Activity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info);

        Intent intent = getIntent();

        String action = intent.getAction();
        String format = "", textInfo = "";

        if(action.equals("ru.startandroid.intent.action.basarab.showtime")){
            format = "HH:mm:ss";
            textInfo = "Time: ";
        } else if (action.equals("ru.startandroid.intent.action.basarab.showdate")){
            format = "dd.MM.yyyy";
            textInfo = "Date: ";
        }

        @SuppressLint("SimpleDateFormat") SimpleDateFormat sdf = new SimpleDateFormat(format);
        String datetime = sdf.format(new Date(System.currentTimeMillis()));

        TextView tvDate = findViewById(R.id.tvInfo);
        tvDate.setText(textInfo + datetime);
    }
}
