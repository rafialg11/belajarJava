package com.belajarJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String publics = "Awikwok sekali";
//        System.out.println("Hello java! 👍 " + publics);
//        System.out.println("Coba");
//
//        Animal Dog = new Animal();
//        Dog.bark("WOOF");
//        Car myCar = new Car();
//        myCar.honk();
        System.out.println("Enter two Number: ");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Select Operator: ");
        String operator = scanner.next();

        Kalkulator kalkulator = new Kalkulator();
        kalkulator.hitung(operator, a,  b);
    }
}