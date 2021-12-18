package javaBasics;
import java.util.*;

public class array {
   public static void main(String[] args) {
       System.out.println("Enter the array elements( 10 ) : ");
       Scanner s= new Scanner(System.in);
       int array[]=new int[10];
    //    int arr;
       for (int i = 0; i < 10; i++) {
           array[i]=s.nextInt();
           
       }
       System.out.println("\n\nPresenting the array :  ");
       for (int i = 0; i < 10; i++) {
           System.out.println(array[i]);
       }
    
   }
}
