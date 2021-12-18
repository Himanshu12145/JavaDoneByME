package javaBasics;
import java.util.*;
public class pat1 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <= n-1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
