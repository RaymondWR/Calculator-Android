package com.example.wangrun.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Calculate extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button dot;
    private EditText screen;
    private String i = "";
    private String j = "";
    private String l = "";
    private String m = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        Button equal = (Button) findViewById(R.id.buttonEqual);
        Button clear = (Button) findViewById(R.id.buttonClear);

        screen = (EditText) findViewById(R.id.editText);

        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn0 = (Button) findViewById(R.id.button0);
        dot = (Button) findViewById(R.id.buttonDot);

    }



    public void Digit(View v){
      if (l == "") {
          if (v.getId() == R.id.button0) {
              j = "" + 0;
              i = i + j;
          }

          if (v.getId() == R.id.button1) {
              j = "" + 1;
              i = i + j;
          }

          if (v.getId() == R.id.button2) {
              j = "" + 2;
              i = i + j;
          }

          if (v.getId() == R.id.button3) {
              j = "" + 3;
              i = i + j;
          }

          if (v.getId() == R.id.button4) {
              j = "" + 4;
              i = i + j;
          }

          if (v.getId() == R.id.button5) {
              j = "" + 5;
              i = i + j;
          }

          if (v.getId() == R.id.button6) {
              j = "" + 6;
              i = i + j;
          }

          if (v.getId() == R.id.button7) {
              j = "" + 7;
              i = i + j;
          }

          if (v.getId() == R.id.button8) {
              j = "" + 8;
              i = i + j;
          }

          if (v.getId() == R.id.button9) {
              j = "" + 9;
              i = i + j;
          }

          if (v.getId() == R.id.buttonDot) {
              j = "" + ".";
              i = i + j;
          }
          screen.setText(i);
      }
        else{
          if (v.getId() == R.id.button0) {
              j = "" + 0;
              m = m + j;
          }

          if (v.getId() == R.id.button1) {
              j = "" + 1;
              m = m + j;
          }

          if (v.getId() == R.id.button2) {
              j = "" + 2;
              m = m + j;
          }

          if (v.getId() == R.id.button3) {
              j = "" + 3;
              m = m + j;
          }

          if (v.getId() == R.id.button4) {
              j = "" + 4;
              m = m + j;
          }

          if (v.getId() == R.id.button5) {
              j = "" + 5;
              m = m + j;
          }

          if (v.getId() == R.id.button6) {
              j = "" + 6;
              m = m + j;
          }

          if (v.getId() == R.id.button7) {
              j = "" + 7;
              m = m + j;
          }

          if (v.getId() == R.id.button8) {
              j = "" + 8;
              m = m + j;
          }

          if (v.getId() == R.id.button9) {
              j = "" + 9;
              m = m + j;
          }

          if (v.getId() == R.id.buttonDot) {
              j = "" + ".";
              m = m + j;
          }
          screen.setText(m);

      }

    }

    public void Operation(View v){
        if(v.getId() == R.id.buttonPlus){
            l = "+";
            //screen.setText("+");
        }
        if(v.getId() == R.id.buttonMinus){
            l = "-";
            //screen.setText("+");
        }
        if(v.getId() == R.id.buttonMultiple){
            l = "*";
            //screen.setText("+");
        }
        if(v.getId() == R.id.buttonDivide){
            l = "/";
            //screen.setText("+");
        }
    }
    public void Equal(View v){
        double num1 = Double.parseDouble(i);
        double num2 = Double.parseDouble(m);
        if(l == "+"){
            double num3 = num1 + num2;
            screen.setText(""+num3);
        }
        if(l == "-"){
            double num3 = num1 - num2;
            screen.setText(""+num3);
        }
        if(l == "*"){
            double num3 = num1 * num2;
            screen.setText(""+num3);
        }
        if(l == "/"){
            double num3 = num1 / num2;
            screen.setText(""+num3);
        }
    }
    public void Clear(View v) {
        i = "";
        j = "";
        m = "";
        l = "";
        screen.setText("");

    }


}
