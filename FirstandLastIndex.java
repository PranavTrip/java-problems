package Pepcoding.FunctionsAndArrays;

import java.util.Scanner;

public class FirstandLastIndex {

    public static void fAndL(int[] arr, int val) {
        int low = 0;
        int high = arr.length - 1;
        int lastIndex = Integer.MIN_VALUE;
        int firstIndex = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (val > arr[mid]) {
                low = mid + 1;

            } else if (val < arr[mid]) {
                high = mid - 1;

            } else {
                lastIndex = mid;
                low = mid + 1;
            }
        }

        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (val > arr[mid]) {
                low = mid + 1;

            } else if (val < arr[mid]) {
                high = mid - 1;

            } else {
                firstIndex = mid;
                high = mid - 1;
            }
        }
        System.out.println(firstIndex);
        System.out.println(lastIndex);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int data = sc.nextInt();
        fAndL(arr, data);
    }
}
