package javaBasics;
import java.util.*;
public class seriesSum {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();
        float res =0;
        for (float i = 1; i <=num; i++) {
            res+= 1/i ;
        }
        System.out.println(res);

        



    }
    
}
