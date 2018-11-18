package ru.startandroid.p0121_logandmess;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvOut;
    Button btnOk, btnCancel;

    private static final String TAG = "myLOGS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Log.d(TAG, "find View elements");
        tvOut = findViewById(R.id.tvOut);
        btnOk = findViewById(R.id.btnOk);
        btnCancel = findViewById(R.id.btnCancel);

        Log.d(TAG, "get listener to button");
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnOk:
                Log.d(TAG, "button OK");
                tvOut.setText("passed button OK");
                Toast.makeText(this, "Нажата кнопка ОК", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnCancel:
                Log.d(TAG, "button CANCEL");
                tvOut.setText("passed button CANCEL");
                Toast.makeText(this, "Нажата кнопка CANCEL", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
