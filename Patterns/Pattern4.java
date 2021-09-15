package Pepcoding;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int stars=n;
        int spaces=0;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=spaces;j++){
                System.out.print("\t");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*\t");
            }
            spaces++;
            stars--;
            System.out.println();
        }
    }
}
