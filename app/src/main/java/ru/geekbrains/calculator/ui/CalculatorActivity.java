package ru.geekbrains.calculator.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import ru.geekbrains.calculator.R;
import ru.geekbrains.calculator.domain.CalculatorImpl;

public class CalculatorActivity extends AppCompatActivity implements CalculatorView {

    private CalculatorPresenter presenter;
    private TextView resultText;
    private TextView inputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new CalculatorPresenter(this, new CalculatorImpl());
        resultText = findViewById(R.id.textView);
        //inputText = findViewById(R.id.textView2);

        findViewById(R.id.Butt_0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onBut_0Click();

            }
        });
        findViewById(R.id.Butt_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onBut_1Click();

            }
        });
        findViewById(R.id.Butt_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onBut_2Click();

            }
        });
        findViewById(R.id.Butt_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onBut_3Click();
            }
        });
        findViewById(R.id.Butt_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onBut_4Click();
            }
        });
        findViewById(R.id.Butt_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onBut_5Click();
            }
        });
        findViewById(R.id.Butt_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onBut_6Click();
            }
        });
        findViewById(R.id.Butt_7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onBut_7Click();
            }
        });
        findViewById(R.id.Butt_8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onBut_8Click();
            }
        });
        findViewById(R.id.Butt_9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onBut_9Click();
            }
        });
        findViewById(R.id.Butt_C).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onButClealClick();
            }
        });
        findViewById(R.id.Butt_POINT).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onButPointClick();
            }
        });
        findViewById(R.id.Butt_PLUS).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onButPlusClick();
            }
        });
        findViewById(R.id.Butt_MINUS).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onButMinusClick();
            }
        });
        findViewById(R.id.Butt_MNOZ).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onButMiltClick();
            }
        });
        findViewById(R.id.Butt_DEL).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onButDivClick();
            }
        });
        findViewById(R.id.Butt_RAVNO).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onButEqualClick();
            }
        });
    }

    @Override
    public void showResult(String result) {
        resultText.setText(result);
    }
    //@Override
    //public void showNumber(String str) {
        //inputText.setText(str);
    //}
}

