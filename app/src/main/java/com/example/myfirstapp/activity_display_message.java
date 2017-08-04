package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class activity_display_message extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent =getIntent();
        String message = intent.getStringExtra(MainActivity.message1);
        String message8 = intent.getStringExtra(MainActivity.message2);
        String message9 = intent.getStringExtra(MainActivity.message3);
        TextView textView = (TextView) findViewById(R.id.tv_1);
        TextView textView8 = (TextView) findViewById(R.id.tv_2);
        TextView textView9 = (TextView) findViewById(R.id.tv_3);
        textView.setText(message);
        textView8.setText(message8);
        textView9.setText(message9);
    }

    public void btn_back22(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
