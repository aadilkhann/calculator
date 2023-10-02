package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity
{ EditText t1,t2,res;
    Button addbtn,subbtn,mulbtn,divbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    { super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (EditText) findViewById(R.id.t1);
        t2 = (EditText) findViewById(R.id.t2);
        res = (EditText) findViewById(R.id.res);
        addbtn = (Button) findViewById(R.id.addbtn);
        subbtn = (Button) findViewById(R.id.subbtn);
        mulbtn = (Button) findViewById(R.id.mulbtn);
        divbtn = (Button) findViewById(R.id.divbtn);
        addbtn.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View v) {
            String v1 = t1.getText().toString();
            String v2 = t2.getText().toString();
            int a = Integer.parseInt(v1);
            int b = Integer.parseInt(v2);
            int c = a + b;
            res.setText("Result =" + c); }
        });
        subbtn.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View v) {
            String v1 = t1.getText().toString();
            String v2 = t2.getText().toString();
            int a = Integer.parseInt(v1);
            int b = Integer.parseInt(v2);
            int c = a - b;
            res.setText("Result =" + c); }
        });
        mulbtn.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View v) {
            String v1 = t1.getText().toString();
            String v2 = t2.getText().toString();
            int a = Integer.parseInt(v1);
            int b = Integer.parseInt(v2);
            int c = a * b;

            res.setText("Result =" + c); }

        });
        divbtn.setOnClickListener(new View.OnClickListener()
        { @Override
        public void onClick(View v) {
            String v1 = t1.getText().toString();
            String v2 = t2.getText().toString();
            int a = Integer.parseInt(v1);
            int b = Integer.parseInt(v2);
            int c = a / b;
            res.setText("Result =" + c); }
        });
    }
}