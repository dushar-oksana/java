public class Homework1 {
    public static void main(String[] args) {
        //Task 1
        char c = 'G';
        int i = 89;
        byte b = 4;
        short s = 56;
        float f = 4.7333436f;
        double d = 4.355453532;
        long l = 12121l;

        System.out.println("char:" + c);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);

        //Task 2.
        int num = 789;
        int ones = num % 10;
        System.out.println(ones);
        int tenth = num % 100 / 10;
        System.out.println(tenth);
        int hundreds = num % 1000 / 100;
        System.out.println(hundreds);

        //Task 3.
        int n = 2;
        System.out.println(n * n);

        int var = 0, var1 = 1, var2 = 2, var3 = 3, var4 = 4, var5 = 5, var6 = 6, var7 = 7, var8 = 8, var9 = 9;
        int sum = (var + var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9) / 10;
        System.out.println(sum); //program will remove part after .

        //Task 4.
        int item_a = 1000;
        int item_b = 500;
        int total = item_a + item_b;
        int discount = 100;
        int discounted = total - discount;
        System.out.println("Price before discount: " + total);
        System.out.println("Price after discount: " + discounted);
    }
}
