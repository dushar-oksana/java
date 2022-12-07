package de.telran.dushar.oksana.homework6;

import java.util.Scanner;

public class TwoNumbers {
    //1. Введите с консоли два числа и выведите больше ли второе число чем первое
    //2. Введите с консоли два числа и выведите больше ли второе число чем первое
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set first number");
        double first = scanner.nextDouble();
        System.out.println("Set second number");
        double second = scanner.nextDouble();
        if (isBigger(first, second)) {
            System.out.println("First number is bigger than second number");
        }
        else {
            System.out.println("First number is not bigger than second number");
        }

        if (isBiggerOrEqual(first, second)) {
            System.out.println("First number is bigger or equal than second number");
        }
        else {
            System.out.println("Second number is smaller than first number");
        }

    }

    public static boolean isBigger(double n1, double n2) {
        return n1 > n2;
    }

    public static boolean isBiggerOrEqual(double n1, double n2) {
        return n1 >= n2;
    }
}
