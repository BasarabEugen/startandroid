package ru.startandroid.p0321_simplebrowser;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        editText = findViewById(R.id.et);
//        et.getText();


        (findViewById(R.id.btnWeb)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://startandroid.ru/")));
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(editText.getText().toString())));
            }
        });

    }

    @Override
    public void onClick(View v) {

    }
}
