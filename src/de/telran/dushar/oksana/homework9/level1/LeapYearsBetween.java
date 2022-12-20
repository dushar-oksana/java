package de.telran.dushar.oksana.homework9.level1;

import java.util.Scanner;

public class LeapYearsBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first year");
        int year1 = scanner.nextInt();
        System.out.println("insert second year");
        int year2 = scanner.nextInt();
        int leapYears = 0;

        for (int i = year1; i <= year2 ; i++) {
            if (checkLeapYear(i)) {
                leapYears += 1;
            }
        }

        System.out.printf("Number of leap years between year %d and year %d is %d", year1, year2, leapYears);
    }

    public static boolean checkLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
