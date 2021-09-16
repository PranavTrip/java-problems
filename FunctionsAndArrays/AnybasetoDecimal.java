package Pepcoding.FunctionsAndArrays;

import java.util.Scanner;

public class AnybasetoDecimal {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int number=sc.nextInt();
        int base=sc.nextInt();
        int newVal=anyBaseToDecimal(number,base);
        System.out.println(newVal);
    }
    public static int anyBaseToDecimal(int number,int base){
        int power=1;
        int newNumber=0;
        while (number>0){
            int digit=number%10;
            number/=10;
            newNumber+=digit*power;
            power*=base;
        }
        return newNumber;
    }
}
