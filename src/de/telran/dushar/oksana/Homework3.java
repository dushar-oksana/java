package de.telran.dushar.oksana;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        //1 Создайте строку I love Java Lessons!
        String str = "I love Java Lessons!";
        //2 Распечатать первый символ строки. Используем метод String.charAt().
        System.out.println(str.charAt(0));
        //3 Проверить, содержит ли строка подстроку “love”. Используем метод String.contains().
        System.out.println(str.contains("love"));
        //4 Заменить все символы “o” на “a”.
        System.out.println(str.replace("o", "a"));
        //5 Преобразуйте строку к верхнему регистру.
        System.out.println(str.toUpperCase());
        //6 Преобразуйте строку к нижнему регистру.
        System.out.println(str.toLowerCase());
        //7 Вырезать строку Lessons c помощью метода String.substring().
        System.out.println(str.substring(str.indexOf("Lessons"), str.indexOf("!")));
        //8 программу для подсчета какой индекс у символа 'L'
        System.out.println(str.indexOf('L'));
        /*9 Напишите программу, которая спрашивает имя и считывает его с консоли с помощью Scanner и
        после пишет на консоль “Hello …….. ! вместо многоточий имя*/
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String readVal = scanner.nextLine();
        System.out.println("Hello " + readVal + "!");
        /*10 Напишите программу, которая спрашивает имя и считывает его с консоли с помощью Scanner и
        после пишет "Ваше имя начинается с буквы …"*/
        System.out.println("What is your name?");
        Scanner scanner2 = new Scanner(System.in);
        String readNewVal = scanner2.nextLine();
        System.out.println("Your name starts at letter " + readNewVal.charAt(0));
        //11 имеется число 59.976, нужно вывести целое из него и перевести в int (явное преобразование типов)
        double num1 = 59.976;
        num1 = Math.round(num1);
        int num2 = (int) num1;
        System.out.println(num2);
        //12перевести число 475 типа int в short
        int num3 = 475;
        short num4 = (short) num3;
        System.out.println(num4);
    }
}
