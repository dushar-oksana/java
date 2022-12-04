package de.telran.dushar.oksana.homework5;

import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
    /* 2) Написать метод который будет возвращать результат склейки двух строк. например:
        вызывается метод со строками  "I love " и "Java" после этого метод вернет I love Java */
        Scanner scanner = new Scanner(System.in);
        System.out.println("First string:");
        String str1 = scanner.nextLine();
        System.out.println("Second string:");
        String str2 = scanner.nextLine();
        System.out.println("Two strings combined: " + combine(str1, str2));
    }

    public static String combine(String s1, String s2) {
        return s1.trim() + " " + s2.trim();
    }
}
