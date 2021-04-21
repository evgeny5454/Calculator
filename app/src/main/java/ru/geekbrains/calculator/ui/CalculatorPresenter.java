package ru.geekbrains.calculator.ui;

import java.util.ArrayList;

import ru.geekbrains.calculator.domain.Calculator;
import ru.geekbrains.calculator.domain.Operation;

public class CalculatorPresenter {

    private CalculatorView view;
    private Calculator calculator;
    ArrayList<String> num = new ArrayList<>();
    boolean userInFirstNum = true;
    private double argOne = 0;
    private double argTwo = 0;
    private double res;
    StringBuilder userInputBuilder;
    String logic = "";
    public CalculatorPresenter(CalculatorView view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }

    public void onBut_0Click() {
        userInputBuilder = new StringBuilder();
        num.add("0");
        for (String s : num) {
            userInputBuilder.append(s);
        }
        view.showResult(String.valueOf(userInputBuilder));
    }

    public void onBut_1Click() {
        userInputBuilder = new StringBuilder();
        num.add("1");
        for (String s : num) {
            userInputBuilder.append(s);
        }
        view.showResult(String.valueOf(userInputBuilder));
    }

    public void onBut_2Click() {
        userInputBuilder = new StringBuilder();
        num.add("2");
        for (String s : num) {
            userInputBuilder.append(s);
        }
        view.showResult(String.valueOf(userInputBuilder));
    }

    public void onButPlusClick() {
        if (userInFirstNum) {
            argOne = Double.parseDouble(String.valueOf(userInputBuilder));
            userInFirstNum = false;
            view.showNumber(String.valueOf(userInputBuilder));
            num.clear();
            logic = "+";
        }
    }

    public void onBut_3Click() {
        userInputBuilder = new StringBuilder();
        num.add("3");
        for (String s : num) {
            userInputBuilder.append(s);
        }
        view.showResult(String.valueOf(userInputBuilder));
    }

    public void onBut_4Click() {
        userInputBuilder = new StringBuilder();
        num.add("4");
        for (String s : num) {
            userInputBuilder.append(s);
        }
        view.showResult(String.valueOf(userInputBuilder));
    }

    public void onBut_5Click() {
        userInputBuilder = new StringBuilder();
        num.add("5");
        for (String s : num) {
            userInputBuilder.append(s);
        }
        view.showResult(String.valueOf(userInputBuilder));
    }

    public void onBut_6Click() {
        userInputBuilder = new StringBuilder();
        num.add("6");
        for (String s : num) {
            userInputBuilder.append(s);
        }
        view.showResult(String.valueOf(userInputBuilder));
    }

    public void onBut_7Click() {
        userInputBuilder = new StringBuilder();
        num.add("7");
        for (String s : num) {
            userInputBuilder.append(s);
        }
        view.showResult(String.valueOf(userInputBuilder));
    }

    public void onBut_8Click() {
        userInputBuilder = new StringBuilder();
        num.add("8");
        for (String s : num) {
            userInputBuilder.append(s);
        }
        view.showResult(String.valueOf(userInputBuilder));
    }

    public void onBut_9Click() {
        userInputBuilder = new StringBuilder();
        num.add("9");
        for (String s : num) {
            userInputBuilder.append(s);
        }
        view.showResult(String.valueOf(userInputBuilder));
    }

    public void onButClealClick() {
        num.clear();
        view.showResult("");
        view.showNumber("");
        argOne = 0;
        argTwo = 0;
        userInFirstNum = true;
        logic = "";
    }

    public void onButPointClick() {
        userInputBuilder = new StringBuilder();
        num.add(".");
        for (String s : num) {
            userInputBuilder.append(s);
        }
        view.showResult(String.valueOf(userInputBuilder));
    }

    public void onButMinusClick() {
        if (userInFirstNum) {
            argOne = Double.parseDouble(String.valueOf(userInputBuilder));
            userInFirstNum = false;
            view.showNumber(String.valueOf(userInputBuilder));
            num.clear();
            logic = "-";
        }
    }

    public void onButMiltClick() {
        if (userInFirstNum) {
            argOne = Double.parseDouble(String.valueOf(userInputBuilder));
            userInFirstNum = false;
            view.showNumber(String.valueOf(userInputBuilder));
            num.clear();
            logic = "*";
        }
    }

    public void onButDivClick() {
        if (userInFirstNum) {
            argOne = Double.parseDouble(String.valueOf(userInputBuilder));
            userInFirstNum = false;
            view.showNumber(String.valueOf(userInputBuilder));
            num.clear();
            logic = "/";
        }
    }

    public void onButEqualClick() {
        if (!userInFirstNum) {
            argTwo = Double.parseDouble(String.valueOf(userInputBuilder));
            userInFirstNum = true;
            num.clear();
        }
        switch (logic) {
            case ("+"):
                res = calculator.binaryOperation(argOne, argTwo, Operation.ADD);
                break;
            case ("-"):
                res = calculator.binaryOperation(argOne, argTwo, Operation.SUB);
                break;
            case ("/"):
                res = calculator.binaryOperation(argOne, argTwo, Operation.DIV);
                break;
            case ("*"):
                res = calculator.binaryOperation(argOne, argTwo, Operation.MULT);
                break;
        }
        view.showResult(String.valueOf(res));
    }
}
