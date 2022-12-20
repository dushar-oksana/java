package de.telran.dushar.oksana.homework8.level1;

import java.util.Scanner;

public class Doorway {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a flat number and program will tell you which doorway is it");
        int flat = scanner.nextInt();

        if (flat < 1 || flat > 90) {
            System.out.println("There is no flat with such number in this house");
        } else if (flat <= 20) {
            System.out.println("This flat is in a doorway 1");
        } else if (flat <= 48) {
            System.out.println("This flat is in a doorway 2");
        } else {
            System.out.println("This flat is in a doorway 3");
        }
    }
}
