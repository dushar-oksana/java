package de.telran.dushar.oksana.homework8.level1;

import java.util.Random;

public class Seasons {
    public static void main(String[] args) {
        Random random = new Random();
        int season = random.nextInt(1,4);
        String result = null;
        switch (season) {
            case 1 -> {
                result = "winter";
            }
            case 2 -> {
                result = "spring";
            }
            case 3 -> {
                result = "summer";
            }
            case 4 -> {
                result = "autumn";
            }
        }

        System.out.printf("The season now is %s", result);
    }
}

