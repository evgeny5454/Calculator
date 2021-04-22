package ru.geekbrains.calculator.ui;

import java.util.ArrayList;

import ru.geekbrains.calculator.domain.CalcHendler;
import ru.geekbrains.calculator.domain.Calculator;
import ru.geekbrains.calculator.domain.Operation;

import static java.lang.Math.floor;

public class CalculatorPresenter {

    private CalculatorView view;
    CalcHendler hendler = new CalcHendler();

    public CalculatorPresenter(CalculatorView view, Calculator calculator) {
        this.view = view;
    }

    public void onBut_0Click() {

        view.showResult(String.valueOf(hendler.setNumber("0")));
    }
    public void onBut_1Click() {

        view.showResult(String.valueOf(hendler.setNumber("1")));
    }
    public void onBut_2Click() {

        view.showResult(String.valueOf(hendler.setNumber("2")));
    }
    public void onButPlusClick() {

        view.showUserInput(String.valueOf(hendler.LogicOperation(" + ")));
    }

    public void onBut_3Click() {

        view.showResult(String.valueOf(hendler.setNumber("3")));
    }
    public void onBut_4Click() {

        view.showResult(String.valueOf(hendler.setNumber("4")));
    }
    public void onBut_5Click() {

        view.showResult(String.valueOf(hendler.setNumber("5")));
    }
    public void onBut_6Click() {

        view.showResult(String.valueOf(hendler.setNumber("6")));
    }
    public void onBut_7Click() {

        view.showResult(String.valueOf(hendler.setNumber("7")));
    }
    public void onBut_8Click() {

        view.showResult(String.valueOf(hendler.setNumber("8")));
    }
    public void onBut_9Click() {

        view.showResult(String.valueOf(hendler.setNumber("9")));
    }
    public void onButClealClick() {
        hendler.clear();
        view.showResult("");
        view.showUserInput("");
    }
    public void onButPointClick() {

        view.showResult(String.valueOf(hendler.setPoint(".")));
    }
    public void onButMinusClick() {

        view.showUserInput(String.valueOf(hendler.LogicOperation(" - ")));
    }
    public void onButMiltClick() {

        view.showUserInput(String.valueOf(hendler.LogicOperation(" * ")));
    }
    public void onButDivClick() {

        view.showUserInput(String.valueOf(hendler.LogicOperation(" / ")));
    }
    public void onButEqualClick() {
        view.showResult(String.valueOf(hendler.Equaly()));
        view.showUserInput(hendler.UserInputString());
    }
}
