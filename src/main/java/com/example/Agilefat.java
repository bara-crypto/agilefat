package com.example;

public class Agilefat {
    public static void main(String[] args) {
        System.out.println("Agilefat Calculator is running!");
        Agilefat calc = new Agilefat();
        System.out.println("Result of 5 + 3: " + calc.add(5, 3));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
