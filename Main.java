package ru.geekbrains.lesson_1;

public class Main {

    public static void main(String[] args) {
        System.out.println(z3(10,2,3,4));
    }

    private static int z3(int a, int b, int c, int d) {
         return a * (b + (c / d));
    }


}
