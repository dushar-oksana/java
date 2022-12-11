package de.telran.dushar.oksana.homework7.level1;

import java.util.Scanner;

public class Cookies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many cookies do you want to buy?");
        int cookiesWish = scanner.nextInt();
        System.out.println("How much money do you have?");
        double moneyHas = scanner.nextDouble();

        if (cookiesWish * 0.5 <= moneyHas) {
            System.out.println("You can buy desired amount of cookies.");
        } else {
            System.out.println(String.format("You don't have enough money to buy %d cookies", cookiesWish));
            System.out.println(String.format("You can buy only %d cookies, to buy %d cookies, you should add %,.2f euro", (int) (moneyHas/0.5), cookiesWish, cookiesWish*0.5-moneyHas));
        }
    }
}
