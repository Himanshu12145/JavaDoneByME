package javaBasics;
import java.util.Scanner;
public class javaHelloi {
    public static void main(String[] args) {
        int fst,b,c=0;
        String str;
        Scanner s=new Scanner(System.in);
        System.out.println("Please Enter the string here for your help in here : ");
        str=s.nextLine();
        System.out.println(str);
        System.out.println("Hello my name is himanshu Shekhar Sahoo in this world ");
        System.out.println("Enter the value for the number : ");
        fst=s.nextInt();
        b=s.nextInt();
        c=fst+b;
        System.out.println(c);

    }
    
}
