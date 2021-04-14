package ru.geekbrains.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> num = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ListenerBut7(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);

        num.add("7");
        StringBuilder sb = new StringBuilder();
        for (String s : num)
        {
            sb.append(s);
        }
        textView.setText(sb);
    }

    public void ListenerBut8(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        num.add("8");
        StringBuilder sb = new StringBuilder();
        for (String s : num)
        {
            sb.append(s);
        }
        textView.setText(sb);
    }

    public void ListenerBut9(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        num.add("9");
        StringBuilder sb = new StringBuilder();
        for (String s : num)
        {
            sb.append(s);
        }
        textView.setText(sb);
    }

    public void ListenerBut4(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        num.add("4");
        StringBuilder sb = new StringBuilder();
        for (String s : num)
        {
            sb.append(s);
        }
        textView.setText(sb);
    }

    public void ListenerBut5(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        num.add("5");
        StringBuilder sb = new StringBuilder();
        for (String s : num)
        {
            sb.append(s);
        }
        textView.setText(sb);
    }

    public void ListenerBut6(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        num.add("6");
        StringBuilder sb = new StringBuilder();
        for (String s : num)
        {
            sb.append(s);
        }
        textView.setText(sb);
    }

    public void ListenerBut1(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        num.add("1");
        StringBuilder sb = new StringBuilder();
        for (String s : num)
        {
            sb.append(s);
        }
        textView.setText(sb);
    }

    public void ListenerBut2(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        num.add("2");
        StringBuilder sb = new StringBuilder();
        for (String s : num)
        {
            sb.append(s);
        }
        textView.setText(sb);
    }

    public void ListenerBut3(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        num.add("3");
        StringBuilder sb = new StringBuilder();
        for (String s : num)
        {
            sb.append(s);
        }
        textView.setText(sb);
    }

    public void ListenerBut0(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        num.add("0");
        StringBuilder sb = new StringBuilder();
        for (String s : num)
        {
            sb.append(s);
        }
        textView.setText(sb);
    }

    public void ListenerButC(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("");
        num.clear();
        textView.setText("0");
    }

    public void ListenerButPoint(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);
        num.add(".");
        StringBuilder sb = new StringBuilder();
        for (String s : num)
        {
            sb.append(s);
        }
        textView.setText(sb);
    }
}