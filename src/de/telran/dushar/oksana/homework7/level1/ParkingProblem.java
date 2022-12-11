package de.telran.dushar.oksana.homework7.level1;

import java.util.Scanner;

public class ParkingProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Today is weekend? yes/no");
        String day = scanner.next();

        if (day.equalsIgnoreCase("no")) {
            System.out.println("You allowed to enter the city");
        } else {
            System.out.println("Give your car number");
            int carNumber = scanner.nextInt();
            System.out.println("Is it a lorry: true/false");
            boolean isLorry = scanner.nextBoolean();
            if (carNumber % 2 != 0 || isLorry) {
                System.out.println("You are not allowed to enter the city");
            } else {
                System.out.println("You allowed to enter the city");
            }

        }
    }
}
