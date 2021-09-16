package Pepcoding.FunctionsAndArrays;

import java.util.Scanner;

public class AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int diffrence = 0;

        if(num1<num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }

        int num1InDecimal = anyBaseToDecimal(num1, base);
        int num2InDecimal = anyBaseToDecimal(num2, base);



        diffrence = num1InDecimal - num2InDecimal;

        int finalResult = decimalToAnyBase(diffrence, base);
        System.out.println(finalResult);

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
