package de.telran.dushar.oksana.homework5;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        // 1.) Написать программу, которая считывает с консоли (Scanner) строку и выводит на консоль ее длину
        System.out.println("Give a string to know it's length");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.length());
    }
}
