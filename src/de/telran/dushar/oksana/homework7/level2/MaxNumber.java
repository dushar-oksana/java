package de.telran.dushar.oksana.homework7.level2;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give first number");
        int first = scanner.nextInt();
        System.out.println("Give second number");
        int second = scanner.nextInt();
        System.out.println("Give third number");
        int third = scanner.nextInt();

        if (first > second && first > third) {
            System.out.println(String.format("Max number is %d", first));
        } else if (first < second && second > third){
            System.out.println(String.format("Max number is %d", second));
        } else System.out.println(String.format("Max number is %d", third));
    }
}
