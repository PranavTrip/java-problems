package Pepcoding.FunctionsAndArrays;

import java.util.Scanner;

public class DecimaltoanyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int base = sc.nextInt();
        int newNumber = decimalToAnyBase(number, base);
        System.out.print(newNumber);
    }

    public static int decimalToAnyBase(int number, int base) {
        int power = 1;
        int newValue = 0;
        while (number > 0) {
            int temp = number % base;
            number /= base;
            newValue += temp * power;
            power *= 10;

        }
        return newValue;
    }
}
