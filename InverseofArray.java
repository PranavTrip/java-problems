package Pepcoding.FunctionsAndArrays;

import java.util.Arrays;
import java.util.Scanner;

public class InverseofArray {

    public static int[] inverse(int[] a) {
        int[] invertedArray = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int val = a[i];
            invertedArray[val] = i;
        }
        return invertedArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(inverse(arr)));

    }
}
