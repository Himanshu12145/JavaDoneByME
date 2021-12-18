package javaBasics.fibbonaaciSeries;

import java.util.*;

public class Fibbo {
    public static void main(String[] args) {
        int num,a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the value of n for fibbonacci series ");
        num=input.nextInt();
        a=0;
        b=1;
        c=0;
        System.out.print(a);
        System.out.print("  "+b+"   ");
        for (int i = 0; i < num-2; i++) {
            c=a+b;
            System.out.print(c+"  ");
            a=b;
            b=c;
            
        }
        









    }
    
}
