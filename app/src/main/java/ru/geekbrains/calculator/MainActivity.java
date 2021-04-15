package ru.geekbrains.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> num = new ArrayList<>();

    private int Num1;
    private int Num2;

    NumbersBox<Integer, Integer> numbersBox = new NumbersBox<>(Num1, Num2);
    String firstNumber;

    String resultString;

    boolean userFirstNumberInput = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ListenerBut7(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        num.add("7");
        StringBuilder userInputBuilder = new StringBuilder();
        for (String s : num) {
            userInputBuilder.append(s);
        }
        textView.setText(userInputBuilder);
    }

    public void ListenerBut8(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        num.add("8");
        StringBuilder userInputBuilder = new StringBuilder();
        for (String s : num) {
            userInputBuilder.append(s);
        }
        textView.setText(userInputBuilder);
    }

    public void ListenerBut9(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        num.add("9");
        StringBuilder userInputBuilder = new StringBuilder();
        for (String s : num) {
            userInputBuilder.append(s);
        }
        textView.setText(userInputBuilder);
    }

    public void ListenerBut4(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        num.add("4");
        StringBuilder userInputBuilder = new StringBuilder();
        for (String s : num) {
            userInputBuilder.append(s);
        }
        textView.setText(userInputBuilder);
    }
    public void ListenerBut5(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        num.add("5");
        StringBuilder userInputBuilder = new StringBuilder();
        for (String s : num) {
            userInputBuilder.append(s);
        }
        textView.setText(userInputBuilder);
    }
    public void ListenerBut6(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        num.add("6");
        StringBuilder userInputBuilder = new StringBuilder();
        for (String s : num) {
            userInputBuilder.append(s);
        }
        textView.setText(userInputBuilder);
    }
    public void ListenerBut1(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        num.add("1");
        StringBuilder userInputBuilder = new StringBuilder();
        for (String s : num) {
            userInputBuilder.append(s);
        }
        textView.setText(userInputBuilder);
    }
    public void ListenerBut2(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        num.add("2");
        StringBuilder userInputBuilder = new StringBuilder();
        for (String s : num) {
            userInputBuilder.append(s);
        }
        textView.setText(userInputBuilder);
    }

    public void ListenerBut3(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        num.add("3");
        StringBuilder userInputBuilder = new StringBuilder();
        for (String s : num) {
            userInputBuilder.append(s);
        }
        textView.setText(userInputBuilder);
    }
    public void ListenerBut0(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        num.add("0");
        StringBuilder userInputBuilder = new StringBuilder();
        for (String s : num) {
            userInputBuilder.append(s);
        }
        textView.setText(userInputBuilder);
    }
    public void ListenerButC(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView.setText("");
        num.clear();
        textView.setText("0");
        textView2.setText("");
    }
    public void ListenerButPoint(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        num.add(".");
        StringBuilder userInputBuilder = new StringBuilder();
        for (String s : num) {
            userInputBuilder.append(s);
        }
        textView.setText(userInputBuilder);
    }
    public void ListenerMultiplication(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        StringBuilder userInputBuilder = new StringBuilder();
        for (String s : num) {
            userInputBuilder.append(s);
        }
        textView.setText("");
        firstNumber = userInputBuilder.toString();
        int number = Integer.parseInt(firstNumber);
        numbersBox.setObj1(number);
        num.clear();
    }
    public void ListenerDivision(View view) {

    }
    public void ListenerMinus (View view){

    }
    public void ListenerPlus (View view){

    }
    public void ListenerEquality (View view){
        TextView textView = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        resultString = Integer.toString(numbersBox.getObj1());
        textView.setText(resultString);
        textView2.setText("");
    }
}

