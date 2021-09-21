package Pepcoding.FunctionsAndArrays;

import java.util.Scanner;

public class RotateanArray {

    public static void rotate(int[] a, int k) {
        k = k % a.length;
        if (k < 0) {
            k += a.length;
        }
        /*Part 1*/
        reverse(a, 0, a.length - k - 1);
        /*Part 2*/
        reverse(a, a.length - k, a.length - 1);
        /*Part 3*/
        reverse(a, 0, a.length - 1);
        for (int val : a) {
            System.out.print(val + " ");
        }
    }

    public static void reverse(int[] a, int i, int j) {

        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            ++i;
            --j;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr, k);

    }
}
