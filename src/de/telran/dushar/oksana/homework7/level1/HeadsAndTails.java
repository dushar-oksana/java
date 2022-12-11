package de.telran.dushar.oksana.homework7.level1;

import java.util.Random;

public class HeadsAndTails {
    public static void main(String[] args) {
        Random random = new Random();

        if (random.nextBoolean()) {
            System.out.println("Tail!");
        } else {
            System.out.println("Head!");
        }
    }
}
