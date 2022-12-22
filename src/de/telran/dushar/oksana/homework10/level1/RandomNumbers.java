package de.telran.dushar.oksana.homework10.level1;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100, 1000);
        System.out.println(number);
        int max = 0;
        int digit;
        while (number > 0) {
            digit = number % 10;
            if (digit > max) {
                max = digit;
            }
            number = (number - digit) / 10;
        }
        System.out.println(max);
    }
}
