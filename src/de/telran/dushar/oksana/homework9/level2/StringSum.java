package de.telran.dushar.oksana.homework9.level2;

import java.util.Scanner;

public class StringSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give a 3 digits number");
        String number = scanner.next();

        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            String n = number.substring(i, i+1);
            sum += Integer.parseInt(n);
        }
        System.out.println(sum);
    }
}
