package de.telran.dushar.oksana.homework5;

public class FiveMethods {
    public static void main(String[] args) {
        // 3) создайте 5 методов с разной сигнатурой, но с одинаковым названием метода (actual methods are below)
        System.out.println(isEqual(1, 2));

        String str1 = "Hello world!";
        String str2 = "Hello puppy!";
        System.out.println(isEqual(str1, str2));
    }
    public static boolean isEqual(int int1, int int2) {
        return int1 == int2;
    }

    public static boolean isEqual(double double1, double double2) {
        return double1 == double2;
    }

    public static boolean isEqual(long var1, long var2) {
        return var1 == var2;
    }

    public static boolean isEqual(char char1, char char2) {
        return char1 == char2;
    }

    public static boolean isEqual(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        else {
            for (int i = 0; i < str1.length() - 1; i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
    }
}
