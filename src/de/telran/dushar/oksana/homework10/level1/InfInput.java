package de.telran.dushar.oksana.homework10.level1;

import java.util.Scanner;

public class InfInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int count = 0;
        double sum = 0;
        do {
            System.out.println("Give a number. '0' will stop the program");
            num = scanner.nextInt();
            sum += num;
            count++;
        } while (num != 0);

        System.out.printf("You gave %d numbers. Sum of the provided numbers is %f and average is %.2f", count, sum, sum/count);
    }
}
