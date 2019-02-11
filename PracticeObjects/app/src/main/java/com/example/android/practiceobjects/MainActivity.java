package com.example.android.practiceobjects;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("Samukz!"+"\nIs on"+"\nFire!!");
        textView.setTextColor(Color.MAGENTA);
        textView.setTextSize(50);
        setContentView(textView);
        textView.setMaxLines(2);
        //setContentView(R.layout.activity_main);
    }
}
