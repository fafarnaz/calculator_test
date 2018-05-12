package com.example.farnaz.farcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_plus, btn_min, btn_ac, btn_eq;
    EditText edText;
    int value1,value2;
    boolean plusFlag,minFlag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_plus = findViewById(R.id.btn_plus);
        btn_min = findViewById(R.id.btn_min);
        btn_eq = findViewById(R.id.btn_eq);
        btn_ac = findViewById(R.id.btn_ac);
        edText = findViewById(R.id.edText);



        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edText.setText(edText.getText() + "1");

            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edText.setText(edText.getText() + "2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edText.setText(edText.getText() + "3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edText.setText(edText.getText() + "4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edText.setText(edText.getText() + "5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edText.setText(edText.getText() + "6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edText.setText(edText.getText() + "7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edText.setText(edText.getText() + "8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edText.setText(edText.getText() + "9");
            }
        });
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edText.setText(edText.getText() + "0");
            }
        });
        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edText.setText("");
            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edText==null){
                    edText.setText("");}
                else{
                   value1=Integer.parseInt(edText.getText()+"");
                plusFlag=true;
                edText.setText(null);}
            }
        });
        btn_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edText==null){
                    edText.setText("");}
                else{
                   value1=Integer.parseInt(edText.getText()+"");
                minFlag=true;
                edText.setText(null);}
            }
        });
        btn_eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value2=Integer.parseInt(edText.getText()+"");

              if (plusFlag==true){
                  edText.setText(value1+value2+"");
              plusFlag=false;}

             else  if (minFlag==true){
                 edText.setText(value1-value2+"");
               minFlag=false;}
            }
        });


    }
}
