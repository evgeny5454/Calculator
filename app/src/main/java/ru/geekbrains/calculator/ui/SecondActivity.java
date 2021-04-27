package ru.geekbrains.calculator.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import ru.geekbrains.calculator.R;
import ru.geekbrains.calculator.domain.Theme;
import ru.geekbrains.calculator.domain.ThemeStorage;

public class SecondActivity extends AppCompatActivity {
    private ThemeStorage themeStorage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        themeStorage = new ThemeStorage(this);
        setTheme(themeStorage.getCurrentTheme().getRes());

        setContentView(R.layout.activity_second);

        View.OnClickListener themeClicked = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.theme_1) {
                    themeStorage.setCurrentTheme(Theme.THEME_1);
                } else if (v.getId() == R.id.theme_2) {
                    themeStorage.setCurrentTheme(Theme.THEME_2);
                } else if (v.getId() == R.id.theme_3) {
                    themeStorage.setCurrentTheme(Theme.THEME_3);
                } else if (v.getId() == R.id.theme_4) {
                    themeStorage.setCurrentTheme(Theme.THEME_4);
                }
                recreate();
            }
        };

        findViewById(R.id.theme_1).setOnClickListener(themeClicked);
        findViewById(R.id.theme_2).setOnClickListener(themeClicked);
        findViewById(R.id.theme_3).setOnClickListener(themeClicked);
        findViewById(R.id.theme_4).setOnClickListener(themeClicked);
    }
}