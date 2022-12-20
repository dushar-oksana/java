package de.telran.dushar.oksana.homework9.level2;

import java.util.Scanner;

public class MultiSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number");
        int first = scanner.nextInt();
        System.out.println("Second number");
        int second = scanner.nextInt();
        int result = 0;

        for (int i = 0; i < first; i++) {
            result += second;
        }

        System.out.println(result);
    }
}
