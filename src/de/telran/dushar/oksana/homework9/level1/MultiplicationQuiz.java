package de.telran.dushar.oksana.homework9.level1;

import java.util.Scanner;

public class MultiplicationQuiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First one digit number");
        int first = scanner.nextInt();
        System.out.println("Second one digit number");
        int second = scanner.nextInt();
        System.out.println("What is the result of multiplication this two numbers?");
        int result = scanner.nextInt();
        int checkResult = first * second;

        if (result == checkResult) {
            System.out.println("Correct!");
        } else {
            System.out.printf("Wrong, correct answer is %d", checkResult);
        }
    }
}
