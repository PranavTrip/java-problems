package Pepcoding.Patterns;


import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = n / 2;
        int st = 1;
        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            int cval = val;
            for (int j = 1; j <= st; j++) {
                System.out.print(cval + "\t");

                if (j <= st / 2) {
                    cval++;
                } else {
                    cval--;
                }
            }
            if (i <= n / 2) {
                spaces--;
                st += 2;
                val++;
            } else {
                spaces++;
                st -= 2;
                val--;
            }
            System.out.println();
        }
    }
}
