package com.zavyalov;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,3);
        int c = calc.divide.apply(a, b);

        calc.println.accept(c);
    }
}
