package de.telran.dushar.oksana.homework9.level1;

public class TwoDigitNumbers {
    public static void main(String[] args) {
        for (int i = 10; i <= 99 ; i++) {
            if (i % 4 == 0 && i % 6 != 0) {
                System.out.println(i);
            }
        }
    }
}
