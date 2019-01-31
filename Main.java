package ru.geekbrains.lesson_1;

public class Main {

    public static void main(String[] args) {
        System.out.println(z3(10, 2, 3, 4));
        System.out.println(z4(1,22));
        z5(-10);
        System.out.println(z6(-10));
        z7("Дамир");
        z8(2004);
    }

    private static int z3(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    private static boolean z4(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else return false;
    }

    private static void z5(int a) {
        if (a >= 0) {
            System.out.println("Передано положительное число");
        } else System.out.println("Передано отрицательное число");
    }

    private static boolean z6(int a) {
        return a < 0 ? true : false;
    }

    private static void z7(String name) {
        System.out.println("Привет, " + name);
    }

    private static void z8(int year) {
        if ((year % 4) != 0) {
            System.out.println(year + " год невысокосный");
        } else if ((year % 100) == 0) {
            if ((year % 400) == 0) {
                System.out.println(year + " год высокосный");
            } else System.out.println(year +" год невысокосный");
        } else System.out.println(year + " год высокосный");
    }
}
