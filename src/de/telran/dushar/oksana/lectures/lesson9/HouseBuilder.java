package de.telran.dushar.oksana.lectures.lesson9;

import java.util.Random;

public class HouseBuilder {

    public static int MAX_HEIGHT = 10;

    public static void main(String[] args) {
        Random random = new Random();
        boolean hasRoof = random.nextBoolean();
        boolean hasWalls = random.nextBoolean();
        int height = random.nextInt(15);
        // %s - string, but parameter can be any, it will be converted to the str
        // %b - boolean
        // %d - digit
        System.out.printf("Roof? %b, Walls? %b, Height: %d%n", hasRoof, hasWalls, height);
        /*if (hasRoof && hasWalls && height <= MAX_HEIGHT) {
            System.out.println("accept");
        } else {
            System.out.println("don't accept");
        }*/

        if (hasWalls) {
            if (hasRoof) {
                if (height<= MAX_HEIGHT) {
                    //все ок
                } else {
                    //высота не ок
                }
                //
            } else {
                if (height<= MAX_HEIGHT) {
                    //крыша не ок
                } else {
                    //крыша и высота не ок
                }
            }
        } else {
            if (hasRoof) {
                if (height<= MAX_HEIGHT) {
                    //стена не ок
                } else {
                    //стена и высота не ок
                }
                //
            } else {
                if (height<= MAX_HEIGHT) {
                    //стена и крыша не ок
                } else {
                    //стена и крыша и высота не ок
                }
            }
        }
    }
}
