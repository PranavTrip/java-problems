package Pepcoding.FunctionsAndArrays;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int digit = sc.nextInt();
        int numberOfDigits = digitFrequency(number, digit);
        System.out.println(numberOfDigits);
    }

    public static int digitFrequency(int num, int dig) {
        int count = 0;
        while (num != 0) {
            int temp = num % 10;
            num /= 10;
            if (temp == dig) {
                count++;
            }
        }
        return count;
    }
}
