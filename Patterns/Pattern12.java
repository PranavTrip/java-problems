package Pepcoding.Patterns;

import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 0;
        int previousValue = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val + "\t");
                int valNew = val + previousValue;
                val = previousValue;
                previousValue = valNew;
            }
            System.out.println();
        }
    }
}
