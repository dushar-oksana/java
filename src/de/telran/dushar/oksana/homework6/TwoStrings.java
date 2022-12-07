package de.telran.dushar.oksana.homework6;

import java.util.Scanner;

public class TwoStrings {
    /* 3) создайте метод который будет принимать 2 строки и писать возвращать строку, которая составляется
    склеиванем первой половины первого слова и второй половины второго слова */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program takes two strings and concatenate halves of them");
        System.out.println("Set a first string");
        String str1 = scanner.nextLine();
        System.out.println("Set a second string");
        String str2 = scanner.nextLine();

        System.out.println("The result is: " + concatStrings(str1, str2));
    }

    public static String concatStrings(String s1, String s2) {
        String s1Half = s1.substring(0, takeMiddle(s1)); /*of course second method is optional; I did it to practice
        using method within other method*/
        String s2Half = s2.substring(takeMiddle(s2));
        return s1Half + s2Half;
    }

    public static int takeMiddle(String s) {
        return (s.length() / 2);
    }
}
