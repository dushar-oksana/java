package de.telran.dushar.oksana.homework7.level2;

import java.util.Scanner;

public class ParkingProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Today is weekend? true/false");
        boolean isWeekend = scanner.nextBoolean();
        System.out.println("Give your car number");
        int carNumber = scanner.nextInt();
        System.out.println("Is it a lorry: true/false");
        boolean isLorry = scanner.nextBoolean();

        if (isWeekend ) {
            if (carNumber % 2 != 0) {
                System.out.println("You are not allowed to enter the city, because your cars with odd numbers are not allowed at weekends");
            } else if (isLorry) {
                System.out.println("You are not allowed to enter the city, because lorries are not allowed at weekends");
            } else {
                System.out.println("You allowed to enter the city");
            }
        } else {
            if (carNumber % 2 != 0 || isLorry) {
                System.out.println("You allowed to enter the city");
            } else {
                System.out.println("You are not allowed to enter the city, because cars with even numbers are not allowed at working days");
            }
        }
    }
}

