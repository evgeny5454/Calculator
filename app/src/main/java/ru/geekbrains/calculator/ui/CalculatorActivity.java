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
    private TextView UserInputText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new CalculatorPresenter(this, new CalculatorImpl());
        resultText = findViewById(R.id.textView);
        UserInputText = findViewById(R.id.textView2);

        View.OnClickListener buttonClicked = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (v.getId() == R.id.Butt_0) {

                    presenter.onBut_0Click();

                } else if (v.getId() == R.id.Butt_1) {

                    presenter.onBut_1Click();

                } else if (v.getId() == R.id.Butt_2) {

                    presenter.onBut_2Click();

                } else if (v.getId() == R.id.Butt_3) {

                    presenter.onBut_3Click();

                } else if (v.getId() == R.id.Butt_4) {

                    presenter.onBut_4Click();

                } else if (v.getId() == R.id.Butt_5) {

                    presenter.onBut_5Click();

                } else if (v.getId() == R.id.Butt_6) {

                    presenter.onBut_6Click();

                } else if (v.getId() == R.id.Butt_7) {

                    presenter.onBut_7Click();

                } else if (v.getId() == R.id.Butt_8) {

                    presenter.onBut_8Click();

                } else if (v.getId() == R.id.Butt_9) {

                    presenter.onBut_9Click();

                } else if (v.getId() == R.id.Butt_C) {

                    presenter.onButClealClick();

                } else if (v.getId() == R.id.Butt_add) {

                    presenter.onButPlusClick();

                } else if (v.getId() == R.id.Butt_eqv) {

                    presenter.onButEqualClick();

                } else if (v.getId() == R.id.Butt_div) {

                    presenter.onButDivClick();

                } else if (v.getId() == R.id.Butt_mult) {

                    presenter.onButMiltClick();

                } else if (v.getId() == R.id.Butt_sub) {

                    presenter.onButMinusClick();

                } else if (v.getId() == R.id.Butt_point) {

                    presenter.onButPointClick();
                }
            }
        };

        findViewById(R.id.Butt_0).setOnClickListener(buttonClicked);
        findViewById(R.id.Butt_1).setOnClickListener(buttonClicked);
        findViewById(R.id.Butt_2).setOnClickListener(buttonClicked);
        findViewById(R.id.Butt_3).setOnClickListener(buttonClicked);
        findViewById(R.id.Butt_4).setOnClickListener(buttonClicked);
        findViewById(R.id.Butt_5).setOnClickListener(buttonClicked);
        findViewById(R.id.Butt_6).setOnClickListener(buttonClicked);
        findViewById(R.id.Butt_7).setOnClickListener(buttonClicked);
        findViewById(R.id.Butt_8).setOnClickListener(buttonClicked);
        findViewById(R.id.Butt_9).setOnClickListener(buttonClicked);
        findViewById(R.id.Butt_C).setOnClickListener(buttonClicked);
        findViewById(R.id.Butt_eqv).setOnClickListener(buttonClicked);
        findViewById(R.id.Butt_div).setOnClickListener(buttonClicked);
        findViewById(R.id.Butt_mult).setOnClickListener(buttonClicked);
        findViewById(R.id.Butt_add).setOnClickListener(buttonClicked);
        findViewById(R.id.Butt_sub).setOnClickListener(buttonClicked);
        findViewById(R.id.Butt_point).setOnClickListener(buttonClicked);
    }

    @Override
    public void showResult(String result) {
        resultText.setText(result);
    }
    @Override
    public void showUserInput(String str) {
        UserInputText.setText(str);
    }
}

