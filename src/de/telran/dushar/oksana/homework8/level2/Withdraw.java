package de.telran.dushar.oksana.homework8.level2;

import java.util.Scanner;

public class Withdraw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 9999 (сумму выдачи в банкомате)");

        int amount = scanner.nextInt();

        int ones = amount % 10;
        int tens = (amount - ones) % 100;
        int hundreds = (amount - tens - ones) % 1000;
        int thousands = (amount - hundreds - tens - ones) % 10000;

        System.out.println(ones);
        System.out.println(tens);
        System.out.println(hundreds);
        System.out.println(thousands);
    }
}
