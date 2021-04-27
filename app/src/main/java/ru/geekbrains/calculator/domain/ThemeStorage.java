package ru.geekbrains.calculator.domain;

import android.content.Context;
import android.content.SharedPreferences;

public class ThemeStorage {
    private static final String KEY_THEME = "KEY_THEME";
    private Context context;
    private SharedPreferences sharedPreferences;

    public ThemeStorage(Context context) {
        this.context = context;

        sharedPreferences = context.getSharedPreferences("ThemePreferences", Context.MODE_PRIVATE);
    }

    public Theme getCurrentTheme() {
        String key = sharedPreferences.getString(KEY_THEME, Theme.THEME_1.getKey());
        for (Theme theme : Theme.values()) {
            if (theme.getKey().equals(key)) {
                    return theme;
            }
        }
        throw new RuntimeException("No!");
    }

    public void setCurrentTheme(Theme theme){
        sharedPreferences.edit().putString(KEY_THEME, theme.getKey()).apply();
    }


}
