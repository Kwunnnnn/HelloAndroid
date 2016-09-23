package com.example.asama.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Toast t;
    String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.button_1);
        btn1.setOnClickListener(this);

        Button btn2 = (Button) findViewById(R.id.button_2);
        btn2.setOnClickListener(this);

        Button btn3 = (Button) findViewById(R.id.button_3);
        btn3.setOnClickListener(this);

        Button btn4 = (Button) findViewById(R.id.button_4);
        btn4.setOnClickListener(this);

        Button btn5 = (Button) findViewById(R.id.button_5);
        btn5.setOnClickListener(this);

        Button btn6 = (Button) findViewById(R.id.button_6);
        btn6.setOnClickListener(this);

        Button btn7 = (Button) findViewById(R.id.button_7);
        btn7.setOnClickListener(this);

        Button btn8 = (Button) findViewById(R.id.button_8);
        btn8.setOnClickListener(this);

        Button btn9 = (Button) findViewById(R.id.button_9);
        btn9.setOnClickListener(this);

        Button btn0 = (Button) findViewById(R.id.button_0);
        btn0.setOnClickListener(this);

        Button btnClear = (Button) findViewById(R.id.clear_button);
        btnClear.setOnClickListener(this);

        TextView tv = (TextView) findViewById(R.id.digit_text_view);
        tv.setText(text);
    }

    @Override
    public void onClick(View v) {
        //Toast t = Toast.makeText(this, "Hello", Toast.LENGTH_SHORT);
        //t.show();
        int id = v.getId();
        TextView tv = (TextView) findViewById(R.id.digit_text_view);
        if (id == R.id.button_1) {
            text = text + "1";
            tv.setText(text);
        }
        else if (id == R.id.button_2) {
            text = text + "2";
            tv.setText(text);
        }
        else if(id == R.id.button_3) {
            text = text + "3";
            tv.setText(text);
        }
        else if(id == R.id.button_4) {
            text = text + "4";
            tv.setText(text);
        }
        else if(id == R.id.button_5) {
            text = text + "5";
            tv.setText(text);
        }
        else if(id == R.id.button_6) {
            text = text + "6";
            tv.setText(text);
        }
        else if(id == R.id.button_7) {
            text = text + "7";
            tv.setText(text);
        }
        else if(id == R.id.button_8) {
            text = text + "8";
            tv.setText(text);
        }
        else if(id == R.id.button_9) {
            text = text + "9";
            tv.setText(text);
        }
        else if(id == R.id.button_0) {
            text = text + "0";
            tv.setText(text);
        }
        else if(id == R.id.clear_button) {
            text = "";
            tv.setText(text);
        }


    }
}
