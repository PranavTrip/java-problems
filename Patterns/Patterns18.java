package Pepcoding.Patterns;

import java.sql.Statement;
import java.util.Scanner;

public class Patterns18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = 0;
        int stars = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= stars; j++) {
                if (i > 1 && i <= n / 2 && j > 1 && j < stars) {
                    System.out.print("\t");
                } else {

                    System.out.print("*\t");
                }
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print("\t");
            }
            if (i <= n / 2) {
                spaces++;
                stars -= 2;
            } else {
                spaces--;
                stars += 2;
            }
            System.out.println();
        }
    }
}
