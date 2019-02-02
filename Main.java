package ru.geekbrains.lesson_1;

public class Main {

    public static void main(String[] args) {
        System.out.println(z3(10, 2, 3, 4));
        System.out.println(z4(1, 22));
        z5(-10);
        System.out.println(z6(-10));
        z7("Дамир");
        System.out.println(z8(false, false));
        // (!(a < b) && !(a > b)) Аналогично (a == b)
        System.out.println(z10(4, 2));
        System.out.println(z11(10, 2, 3));
        z12(2000);
        System.out.println(z13(5, 10));
        System.out.println(z14());
        System.out.println(z15(314152232));
        System.out.println(z16(19, 4));
        z17(10, 200, 123);

    }

    private static int z3(int a, int b, int c, int d) {
        /*
         Метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
         где a, b, c, d – входные параметры этого метода;
         */
        return a * (b + (c / d));
    }

    private static boolean z4(int a, int b) {
        /*
         Метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах
        от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
         */
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else return false;
    }

    private static void z5(int a) {
        /*
        Метод, которому в качестве параметра передается целое число, метод должен
        напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль
        считаем положительным числом
         */
        if (a >= 0) {
            System.out.println("Передано положительное число");
        } else System.out.println("Передано отрицательное число");
    }

    private static boolean z6(int a) {
        /*
        Метод, которому в качестве параметра передается целое число, метод должен вернуть
        true, если число отрицательное
         */
        return a < 0 ? true : false;
    }

    private static void z7(String name) {
        /*
        Метод, которому в качестве параметра передается строка, обозначающая имя, метод
        должен вывести в консоль сообщение «Привет, указанное_имя!»
         */
        System.out.println("Привет, " + name);
    }

    private static boolean z8(boolean a, boolean b) {
        /*
        a и b - переменные типа boolean. Метод, который доказывает, выражение true.
        выражение (!(a && b) && (a || b)) || ((a && b) || !(a || b))
         */
        return (!(a && b) && (a || b)) || ((a && b) || !(a || b));
    }

    private static boolean z10(int a, int b) {
        /*
        Метод, который получает на вход два положительных числа и выводит true, если одно из них нацело делится на другое
         */
        return (a % b) == 0 ? true : false;
    }

    private static boolean z11(int a, int b, int c) {
        /*
        Метод, котрый получает на вход 3 положительных числа и проверяет что одно из них больше суммы других двух.
        (Применяется для проверки, могут ли числа быть сторонами треугольника)
         */
        if ((a > 0) && (b > 0) && (c > 0)) {
            if ((a > (b + c)) || (b > (a + c)) || (c > (a + b))) {
                return true;
            }
            return false;
        } else return false;
    }

    private static void z12(int year) {
        /*
        Метод, который определяет является ли год високосным, и выводит сообщение в
        консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
        високосный.
         */
        if ((year % 4) != 0) {
            System.out.println(year + " год невысокосный");
        } else if ((year % 100) == 0) {
            if ((year % 400) == 0) {
                System.out.println(year + " год высокосный");
            } else System.out.println(year + " год невысокосный");
        } else System.out.println(year + " год высокосный");
    }

    private static int z13(int a, int b) {
        /*
        Метод, который получает на вход два целых числа и выводит случайное число в этом диапазоне
         */
        return (int) (Math.random() * (b - a + 1)) + a;
    }

    private static int z14() {
        /*
        Метод, который выводит сумму двух случайных чисел от 1 до 6. (имитация броска кубиков)
         */
        int min = 1;
        int max = 6;
        return z13(min, max) + z13(min, max);
    }

    private static double z15(double t) {
        /*
        Метод, который получает на вход число t и выводит в консоль результат выражения
        sin(2t) + sin(3t)
         */
        return Math.sin(2 * t) + Math.sin(3 * t);
    }

    private static boolean z16(int d, int m) {
        /*
        метод, который получает на вход целочисленные m и d и проверяет, что введённые m-месяц и d-день, лежат
        в промежутке от 20.03 до 20.06.
         */
        if ((m == 3) && (d <= 31) && (d >= 20)) {
            return true;
        } else if ((m == 4) && (d >= 1) && (d <= 30)) {
            return true;
        } else if ((m == 5) && (d >= 1) && (d <= 31)) {
            return true;
        } else if ((m == 6) && (d >= 1) && (d <= 20)) {
            return true;
        } else return false;
    }

    private static void z17(int r, int g, int b) {
       /*
       Метод, который на вход получает информацию о цвете в формате RGB и переводит их в формат CMYK.
       Результат вывести в консоль
         */
        if ((r < 0) || (g < 0) || (b < 0) || (r > 255) || (g > 255) || (b > 255)) {
            System.out.println("Значение цвета в RGB должно быть в диапазоне 0-255");
            return;
        }
        float computedC = 1 - (r / 255);
        float computedM = 1 - (g / 255);
        float computedY = 1 - (b / 255);
        int minCMY = (int) Math.min(computedC, (int) Math.min(computedM, computedY));
        float c = (computedC - minCMY) / (1 - minCMY);
        float m = (computedM - minCMY) / (1 - minCMY);
        float y = (computedY - minCMY) / (1 - minCMY);
        System.out.println("C:" + c + " M:" + m + " Y:" + y + " K:" + minCMY);
    }

    private static int min(int a, int b, int c) {
        /*
        Метод для поиска минимального значения из трех целых чисел
         */
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }
}
