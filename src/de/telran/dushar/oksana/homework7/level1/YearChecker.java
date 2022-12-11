package de.telran.dushar.oksana.homework7.level1;

import java.util.Scanner;

public class YearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide a year");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Common Year");
                }
            } else {
                System.out.println("Leap Year");
            }
        } else {
            System.out.println("Common Year");
        }
    }
}
