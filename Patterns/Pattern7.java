package Pepcoding.Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces=n-1;
        int stars=1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= spaces; j++) {
                if(i==j){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }

            System.out.println();
        }
    }
}
