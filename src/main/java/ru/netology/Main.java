package ru.netology;

public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.sum(333, 222));
        System.out.println(calc.mult(25,5));
        System.out.println(calc.pow(15, 2));
    }
}