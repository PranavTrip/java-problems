package Pepcoding.FunctionsAndArrays;

import java.util.Scanner;

public class Sumof2Arrays {
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

        int[] a3 = new int[Math.max(n1, n2)];
        int carry = 0;
        int i = a1.length - 1;
        int j = a2.length - 1;
        int k = a3.length - 1;
        while (k >= 0) {
            int digit = carry;
            if (i >= 0) {
                digit += a1[i--];
            }
            if (j >= 0) {
                digit += a2[j--];
            }
            carry = digit / 10;
            digit %= 10;
            a3[k--] = digit;
        }
        if (carry > 0) {
            System.out.println(carry);
        } else {
            for (int val : a3
            ) {
                System.out.println(val);

            }
        }

    }
}
