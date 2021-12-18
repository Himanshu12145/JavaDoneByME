package javaBasics;
import java.util.*;
public class seriesSumCum
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number :");
        Scanner s= new Scanner(System.in);
        int num = s.nextInt();
        float res =0,res_even=0,res_odd=0;
        for (float i = 1; i <=num; i++) 
        {
            if(i%2==0)
                    res_even-= 1/i ;
            else
                    res_odd+= 1/i;
            res=res_even+res_odd;
                    
        }
        System.out.println(res);

    }    
}
