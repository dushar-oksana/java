package de.telran.dushar.oksana.homework9.level1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number");
        int number = scanner.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Not a prime number");
            } else {
                System.out.println("Prime number");
            }
        }
    }
}
