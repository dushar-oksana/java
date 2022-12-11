package de.telran.dushar.oksana.homework7.level1;

import java.util.Scanner;

public class AgeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your age, to know if you allowed to watch movie.");
        int age = scanner.nextInt();
        checkAge(age);

    }

    public static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("Allowed to watch movie");
        } else {
            System.out.println("Not allowed to watch movie");
        }
    }
}
