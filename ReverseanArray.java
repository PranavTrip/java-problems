package Pepcoding.FunctionsAndArrays;

import java.util.Scanner;

public class ReverseanArray {
    public static void reverse(int[] a) {

        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;

        }
        for (int val : a) {
            System.out.print(val + "\t");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    }

}
