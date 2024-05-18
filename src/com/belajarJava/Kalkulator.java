package com.belajarJava;

public class Kalkulator {
    public void hitung(String operator, int a, int b) {
        if (operator.equals("+")) {
            System.out.println(a + b);
        } else if (operator.equals("-")) {
            System.out.println(a - b);
        } else if (operator.equals("*")) {
            System.out.println(a * b);
        } else if (operator.equals("/")) {
            System.out.println(a / b);
        }
    }
}
