package Pepcoding.Patterns;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int outerSpacing=n/2;
        int innerSpacing=-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=outerSpacing;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for (int j=1;j<=innerSpacing;j++){
                System.out.print("\t");
            }
            if(i>1 && i<n){
                System.out.print("*");
            }

            if(i<=n/2){
                outerSpacing--;
                innerSpacing+=2;
            }
            else{
                outerSpacing++;
                innerSpacing-=2;
            }
            System.out.println();
        }
    }
}
