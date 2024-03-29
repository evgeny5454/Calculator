package ru.geekbrains.calculator.domain;

import java.util.ArrayList;

public class CalcHendler  {

    private Calculator calculator;

    StringBuilder inputStrBuild;
    ArrayList<String> num = new ArrayList<>();

    boolean pointInp = true;
    boolean userInpFirst = true;
    boolean setResult = false;

    private double argOne;
    private double argTwo;
    private double res;
    private double result;

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
        argOne = 0;
        argTwo = 0;
        //result = 0;
    }

    public String LogicOperation(String stringLogic) {

        if (userInpFirst) {
            stringLogicResult = stringLogic;
            argOne = Double.parseDouble(String.valueOf(inputStrBuild));
            userInpFirst = false;
            pointInp = true;
            num.clear();
            return (argOne + stringLogic);

        } else if (setResult) {
            Equaly();
            argOne = result;
            num.clear();
            stringLogicResult = stringLogic;
            return (argOne + stringLogic);

        } else {

            Equaly();
        }
        return (argOne + stringLogic + argTwo) ;
    }

    public String Equaly() {

        calculator = new CalculatorImpl();

        argTwo = Double.parseDouble(String.valueOf(inputStrBuild));

        pointInp = true;
        setResult = true;

        num.clear();

        switch (stringLogicResult) {
            case (" + "):
                res = (calculator.binaryOperation(argOne, argTwo, Operation.ADD));
                result = res;
                //argOne = 0;
                //argTwo = 0;
                //stringLogicResult ="";
                break;
            case (" - "):
                res = (calculator.binaryOperation(argOne, argTwo, Operation.SUB));
                result = res;
                //argOne = 0;
                //argTwo = 0;
                //stringLogicResult ="";
                break;
            case (" * "):
                res = (calculator.binaryOperation(argOne, argTwo, Operation.MULT));
                result = res;
                //argOne = 0;
                //argTwo = 0;
                //stringLogicResult ="";
                break;
            case (" / "):
                res = (calculator.binaryOperation(argOne, argTwo, Operation.DIV));
                result = res;
                //argOne = 0;
                //argTwo = 0;
                //stringLogicResult ="";
                break;
        }

        return String.valueOf(res);
    }

    public String UserInputString() {

        return (argOne + stringLogicResult + argTwo) ;
    }
}
