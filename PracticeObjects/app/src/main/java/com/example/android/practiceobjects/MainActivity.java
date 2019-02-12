package com.example.android.practiceobjects;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView firstMenu = (TextView) findViewById(R.id.menu_item_1);
        String messageOne = (String) firstMenu.getText();


        // Find second menu item TextView and print the text to the logs
        TextView secondMenu = (TextView) findViewById(R.id.menu_item_2);
        String messageTwo = (String) secondMenu.getText();

        // Find third menu item TextView and print the text to the logs
        TextView thirdMenu = (TextView) findViewById(R.id.menu_item_3);
        String messageThree = (String) thirdMenu.getText();

        Log.i("MainActivity", messageOne);
        Log.i("MainActivity", messageTwo);
        Log.i("MainActivity", messageThree);
    }
}