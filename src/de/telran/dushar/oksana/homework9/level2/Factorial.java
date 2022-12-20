package de.telran.dushar.oksana.homework9.level2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give a number");
        int number = scanner.nextInt();
        long factorial = getFactorial(number);
        System.out.printf("Factorial or %d is %d", number, factorial);
    }

    public static int getFactorial(int n){
        if (n > 1) {
            return n * getFactorial(n - 1);
        } else {
            return 1;
        }
    }
}
