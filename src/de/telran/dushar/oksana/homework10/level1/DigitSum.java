package de.telran.dushar.oksana.homework10.level1;

import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a random number");
        int num = scanner.nextInt();
        int sum = 0;
        int digit;
        while (num > 0) {
            digit = num % 10;
            sum += digit;
            num = (num - digit) / 10;
        }
        System.out.printf("Sum of all digits in provided number is %d", sum);
    }
}
