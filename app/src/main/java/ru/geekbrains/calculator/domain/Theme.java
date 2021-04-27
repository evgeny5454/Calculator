package ru.geekbrains.calculator.domain;

import ru.geekbrains.calculator.R;

public enum Theme {
    THEME_1("Theme_1", R.style.Theme_Calculator),
    THEME_2("Theme_2", R.style.Theme_Calculator2),
    THEME_3("Theme_3", R.style.Theme_Calculator3),
    THEME_4("Theme_4", R.style.Theme_Calculator4);

    private final String key;
    private final int res;

    Theme (String key, int res) {
        this.key = key;
        this.res = res;
    }

    public String getKey() {
        return key;
    }

    public int getRes() {
        return res;
    }
}
