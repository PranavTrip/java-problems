package Pepcoding.FunctionsAndArrays;

import java.util.Scanner;

public class AnybasetoAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int base1 = sc.nextInt();
        int base2 = sc.nextInt();
        int val1 = anyBaseToDecimal(number, base1);
        int finalVal = decimalToAnyBase(val1, base2);
        System.out.println(finalVal);
    }

    public static int anyBaseToDecimal(int number, int base) {
        int power = 1;
        int newNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            number /= 10;
            newNumber += digit * power;
            power *= base;
        }
        return newNumber;
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
