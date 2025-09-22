package javaStringReverse;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        /* My code*/
        StringBuilder sb = new StringBuilder(A);
        sb.reverse();
        String stringReverse = sb.toString();
        
        String result = A.equals(stringReverse) ? "Yes" : "No";
        System.out.println(result);
    }
}
