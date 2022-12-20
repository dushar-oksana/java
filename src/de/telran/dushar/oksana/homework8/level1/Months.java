package de.telran.dushar.oksana.homework8.level1;

import java.util.Random;

public class Months {
    public static void main(String[] args) {
        Random rand = new Random();
        int month = rand.nextInt(1, 12);
        int season;

        if (month == 12 || month <= 2) {
            season = 1;
        } else if (month <= 5) {
            season = 2;
        } else if (month <= 8) {
            season = 3;
        } else {
            season = 4;
        }

        String result = checkSeason(season);

        System.out.printf("The season now is %s", result);
        }

    public static String checkSeason(int season) {
        switch (season) {
            case 1 -> {
                return "winter";
            }
            case 2 -> {
                return "spring";
            }
            case 3 -> {
                return "summer";
            }
            case 4 -> {
                return "autumn";
            }
            default -> {
                return "no such season";
            }
        }
    }
}


