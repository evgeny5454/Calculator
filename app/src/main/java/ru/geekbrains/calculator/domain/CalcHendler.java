package ru.geekbrains.calculator.domain;

import java.util.ArrayList;

import ru.geekbrains.calculator.ui.CalculatorPresenter;
import ru.geekbrains.calculator.ui.CalculatorView;

public class CalcHendler  {

    private Calculator calculator;

    StringBuilder inputStrBuild;
    ArrayList<String> num = new ArrayList<>();
    boolean pointInp = true;
    boolean userInpFirst = true;

    private double argOne;
    private double argTwo;
    private double res;
    double result;
    String stringLogicResult;


    public String setNumber(String string) {
        inputStrBuild = new StringBuilder();
        num.add(string);
        for (String s : num) {
            inputStrBuild.append(s);
        }
        return (String.valueOf(inputStrBuild));
    }

    public String setPoint(String string) {
        if (pointInp) {
            inputStrBuild = new StringBuilder();
            num.add(string);
            for (String s : num) {
                inputStrBuild.append(s);
            }
            pointInp = false;
        }
        return (String.valueOf(inputStrBuild));
    }

    public void clear() {
        num.clear();
        pointInp = true;
        userInpFirst = true;
    }

    public String LogicOperation(String stringLogic) {
        stringLogicResult = stringLogic;
        if (userInpFirst) {
            argOne = Double.parseDouble(String.valueOf(inputStrBuild));
            userInpFirst = false;
            pointInp = false;
            num.clear();
            pointInp = true;
            return (argOne + stringLogic);
        } else {
            Equaly();
        }
        return (argOne + stringLogic + argTwo) ;
    }

    public String Equaly() {
        calculator = new CalculatorImpl();
        argTwo = Double.parseDouble(String.valueOf(inputStrBuild));
        userInpFirst = true;
        switch (stringLogicResult) {
            case (" + "):
                res = (calculator.binaryOperation(argOne, argTwo, Operation.ADD));
                break;
            case (" - "):
                res = (calculator.binaryOperation(argOne, argTwo, Operation.SUB));
                break;
            case (" * "):
                res = (calculator.binaryOperation(argOne, argTwo, Operation.MULT));
                break;
            case (" / "):
                res = (calculator.binaryOperation(argOne, argTwo, Operation.DIV));
                break;
        }
        return String.valueOf(res);
    }
    public String UserInputString() {
        return (argOne + stringLogicResult + argTwo) ;
    }
}
