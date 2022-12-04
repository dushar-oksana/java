package de.telran.dushar.oksana.homework5;


import java.util.Scanner;

public class TempConverterTest {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a temperature");
        int temp = scanner.nextInt();

        TempConverter converter = new TempConverter(temp);
        System.out.println(String.format("This is (%d) in Fahrenheit", converter.toFahrenheit()));
        System.out.println(String.format("This is (%d) in Celsius", converter.toCelsius()));
    }
}
