package de.telran.dushar.oksana.homework9.level2;

import java.util.Scanner;

public class StringHalvesSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give a 6 digits number");
        String number = scanner.next();

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < number.length(); i++) {
            if (i % 2 == 0) {
                String n = number.substring(i, i+1);
                sum1 += Integer.parseInt(n);
            } else {
                String n = number.substring(i, i+1);
                sum2 += Integer.parseInt(n);
            }
        }

        if (sum1 == sum2) {
            System.out.println("yes, sum of the first half is equal to sum of the second half");
        } else {
            System.out.println("no, sum of the first and second halves are not equal");
        }

    }
}
