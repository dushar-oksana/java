package de.telran.dushar.oksana.homework9.level1;

public class MagicMultiplication {
    public static void main(String[] args) {
        int result = 1;
        for (int i = 10; i < 100; i++) {
            if (i % 13 == 0 && i % 2 != 0) {
                result *= i;
            }
        }
        System.out.println(result);
    }
}
