package Pepcoding.FunctionsAndArrays;

import java.util.Scanner;

public class Diffrenceof2arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] a1 = new int[n1];
        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }
        int[] a3 = new int[n2];
        int carry = 0;
        int i = a1.length - 1;
        int j = a2.length - 1;
        while (j >= 0) {
            int digit = carry;
            int valueOfa1 = i >= 0 ? a1[i] : 0;
            if (a2[j] + carry >= valueOfa1) {
                digit = a2[j] + carry - valueOfa1;
                carry = 0;
            } else {
                digit = a2[j] + carry+10 - valueOfa1;
                carry = -1;
            }
            a3[j] = digit;
            i--;
            j--;
        }
        /*Checking for leading zeroes*/
        int index = 0;
        while (a3[index] == 0) {
            ++index;
        }
        /*Printing after leading zeroes*/
        while (index < a3.length) {
            System.out.println(a3[index++]);
        }
    }
}
