package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
/*application By Sukrit khadlae Rmutsv ICT*/
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String message1 = "message1";
    public static final String message2 = "message3";
    public static final String message3 = "message4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view) {
        Intent intent = new Intent(this, activity_display_message.class);
        EditText editText = (EditText) findViewById(R.id.et_text1);
        EditText editText1 = (EditText) findViewById(R.id.et_text2);
        EditText editText2 = (EditText) findViewById(R.id.et_text3);
        String message = editText.getText().toString();
        String message5 = editText1.getText().toString();
        String message6 = editText2.getText().toString();
        intent.putExtra(message1, message);
        intent.putExtra(message2, message5);
        intent.putExtra(message3, message6);
        startActivity(intent);

    }
}