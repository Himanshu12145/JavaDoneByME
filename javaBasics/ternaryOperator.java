package javaBasics;
import java.util.*;
public class ternaryOperator {
    public static void main(String[] args) {
        
            Scanner s = new Scanner(System.in);
            int a,b,c,d;
        System.out.println("Enter the numbers ");
        System.out.println("Enter the first number : ");
                a=s.nextInt();
        System.out.println("Enter the second number : ");
                b=s.nextInt();
        System.out.println("Enter the third number : ");
                c=s.nextInt();
                System.out.println("The largest between all these are : (Enter y/n to proceed :)");
                char str;
                s.nextLine();
               str=s.nextLine().charAt(0);   
                        if (str=='y' || str=='Y') {

                            d=(a>b?(a>c?a:c):(b>c?b:c));
                            System.out.println("So the largest among the entered numbers are : \n" + d);
                        }
                        else if(str=='n'||str=='N'){
                            System.out.println("You !! have enter 'n' as according to your wish so go to hell !!!!");
                            //return(
                        }
                        else{
                            System.out.println("Here you have entered an wrong info so re-enter the value that is (y/n)");
                        }
                        //return str;

    }
    
}
