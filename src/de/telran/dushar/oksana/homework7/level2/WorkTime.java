package de.telran.dushar.oksana.homework7.level2;

import java.util.Random;

public class WorkTime {
    public static void main(String[] args) {
        Random random = new Random();
        int timeLeft = random.nextInt(28800);
        System.out.println(String.format("Осталось %d секунд", timeLeft));

        int hoursLeft = timeLeft / 60 / 60;
        if (hoursLeft <= 8 && hoursLeft >= 5) {
            System.out.printf("Осталось %d часов", hoursLeft);
        } else if (hoursLeft <= 4 && hoursLeft >= 2) {
            System.out.printf("Осталось %d часа", hoursLeft);
        } else if (hoursLeft == 1) {
            System.out.printf("Остался 1 час");
        } else {
            System.out.println("Осталось менее часа");
        }
    }
}
