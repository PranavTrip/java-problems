package Pepcoding.FunctionsAndArrays;

import java.util.Scanner;

public class BrokenEconomy {

    public static void brokenEconomy(int[] arr, int val) {
        int low = 0;
        int high = arr.length - 1;
        int floor = Integer.MIN_VALUE;
        int ceil = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (val > arr[mid]) {
                low = mid + 1;
                floor = arr[mid];
            } else if (val < arr[mid]) {
                high = mid - 1;
                ceil = arr[mid];
            } else {
                ceil = floor = arr[mid];
                break;
            }

        }
        System.out.println(ceil);
        System.out.println(floor);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int value = sc.nextInt();
        brokenEconomy(arr, value);
    }
}
