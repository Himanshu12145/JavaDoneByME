package javaBasics;
import java.util.*;
public class power {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x,y,expo=1;
        System.out.println("Enter the x :(base):" );
        x=s.nextInt();
        System.out.println("Enter the y : (power) :");
        y=s.nextInt();
        for (int i = 0; i <= y-1 ; i++) {
            expo*=x;
        }
        System.out.println("So now the power is : "+expo);
    }
    
}
