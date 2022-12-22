package de.telran.dushar.oksana.homework10.level1;

import java.util.Scanner;

public class OddInfSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program calculates sum of odd numbers in the provided interval of numbers.");
        System.out.println("Provide start of the numbers row");
        int start = scanner.nextInt();
        System.out.println("Provide end of the numbers row");
        int end = scanner.nextInt();
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.printf("Sum of the odd numbers in this row is %d", sum);
    }
}
