package javaBasics;
import java.util.*;


public class primeNumbers {
    public static void main(String[] args) {
        int num,f=0;
    System.out.println("Enter the number : ");
    Scanner s=new Scanner(System.in);
    num=s.nextInt();
            for (int i = 2; i*i <= num; i++) {
                if (num%i==0) {
                    f++;
                    break;
                }
             
            }
            if (f>0) {
                
                System.out.println("Number is not prime : ");
            }
            else{
             System.out.println("Number is prime : ");
            }
    }
}
