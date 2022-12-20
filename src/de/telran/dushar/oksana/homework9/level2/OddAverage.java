package de.telran.dushar.oksana.homework9.level2;

public class OddAverage {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int average = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
                count++;
            }
        }

        average = sum / count;
        System.out.println(average);
    }
}
