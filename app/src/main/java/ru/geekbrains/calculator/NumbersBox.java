package ru.geekbrains.calculator;

public class NumbersBox <Num1, Num2> {
    private Num1 obj1;
    private Num2 obj2;

    public NumbersBox(Num1 obj1, Num2 obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;

    }
    public Num1 getObj1() {
        return obj1;
    }

    public Num2 getObj2() {
        return obj2;
    }

    public void setObj1(Num1 obj) {
        this.obj1 = obj;
    }

    public void setObj2(Num2 obj) {
        this.obj2 = obj;
    }
}
