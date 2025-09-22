package javaStringsIntroduction;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        sc.close();
        
        int sumStrings = A.length() + B.length();
        System.out.println(sumStrings);
        
        if(A.compareToIgnoreCase(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        };
        
        String aString = A.substring(0,1).toUpperCase() + A.substring(1);
        String bString = B.substring(0,1).toUpperCase() + B.substring(1);
        
        System.out.println(aString + " " + bString);
    }
}
