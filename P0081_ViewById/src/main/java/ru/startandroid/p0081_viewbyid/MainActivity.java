package ru.startandroid.p0081_viewbyid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView myTextView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);


        TextView myTextView = findViewById(R.id.textView);
        myTextView.setText("New text in TextView");

        Button myBtn = findViewById(R.id.button);
        myBtn.setText("My button everyone");
        myBtn.setEnabled(false);

        CheckBox myChb = findViewById(R.id.checkBox);
        myChb.setChecked(true);


    }
}
