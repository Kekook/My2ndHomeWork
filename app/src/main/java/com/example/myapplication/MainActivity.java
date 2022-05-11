package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int number = 0 ;
    private TextView text1;
    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonC;
    Button butDemi;
    double num1 = 0;
    double num2 = 0;
    double result = 0;
    int op = 0;



    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("number_key",number);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (TextView) findViewById(R.id.text1);
        button0 = (Button) findViewById(R.id.bot_0);
        button1 = (Button) findViewById(R.id.bot_1);
        button2 = (Button) findViewById(R.id.bot_2);
        button3 = (Button) findViewById(R.id.bot_3);
        button4 = (Button) findViewById(R.id.bot_4);
        button5 = (Button) findViewById(R.id.bot_5);
        button6 = (Button) findViewById(R.id.bot_6);
        button7 = (Button) findViewById(R.id.bot_7);
        button8 = (Button) findViewById(R.id.bot_8);
        button9 = (Button) findViewById(R.id.bot_9);
        buttonC = (Button) findViewById(R.id.botC);
        butDemi = (Button) findViewById(R.id.bot_demi);
        if(savedInstanceState != null && savedInstanceState.containsKey("number_key")){
            number = savedInstanceState.getInt("number_key");
        }

        button1.setOnClickListener( new mClick());
        button2.setOnClickListener( new mClick());
        button3.setOnClickListener( new mClick());
        button4.setOnClickListener( new mClick());
        button5.setOnClickListener( new mClick());
        button6.setOnClickListener( new mClick());
        button7.setOnClickListener( new mClick());
        button8.setOnClickListener( new mClick());
        button9.setOnClickListener( new mClick());
        button0.setOnClickListener( new mClick());
        buttonC.setOnClickListener( new mClick());
        butDemi.setOnClickListener( new mClick());


    }

    class mClick implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.botC:
                    text1.setText(null);
                    break;
                case R.id.bot_1:
                    String str = text1.getText().toString();
                    str += "1";
                    text1.setText(str);
                    break;
                case R.id.bot_2:
                    String str2 = text1.getText().toString();
                    str2 += "2";
                    text1.setText(str2);
                    break;
                case R.id.bot_3:
                    String str3 = text1.getText().toString();
                    str3 += "3";
                    text1.setText(str3);
                    break;
                case R.id.bot_4:
                    String str4 = text1.getText().toString();
                    str4 += "4";
                    text1.setText(str4);
                    break;
                case R.id.bot_5:
                    String str5 = text1.getText().toString();
                    str5 += "5";
                    text1.setText(str5);
                    break;
                case R.id.bot_6:
                    String str6 = text1.getText().toString();
                    str6 += "6";
                    text1.setText(str6);
                    break;
                case R.id.bot_7:
                    String str7 = text1.getText().toString();
                    str7 += "7";
                    text1.setText(str7);
                    break;
                case R.id.bot_8:
                    String str8 = text1.getText().toString();
                    str8 += "8";
                    text1.setText(str8);
                    break;
                case R.id.bot_9:
                    String str9 = text1.getText().toString();
                    str9 += "9";
                    text1.setText(str9);
                    break;
                case R.id.bot_0:
                    String str0 = text1.getText().toString();
                    str0 += "0";
                    text1.setText(str0);
                    break;
                case R.id.bot_demi:
                    String strDemi = text1.getText().toString();
                    strDemi += ".";
                    text1.setText(strDemi);
                    break;


            }
        }
    }
}


