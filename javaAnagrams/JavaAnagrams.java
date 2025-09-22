package javaAnagrams;

import java.util.Scanner;

public class JavaAnagrams {
    static boolean isAnagram(String a, String b) {
        // My code
        if(a.length() != b.length()) {
            return false;    
        };
        a = a.toUpperCase();
        b = b.toUpperCase();
            
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
            
        java.util.Arrays.sort(arrA);
        java.util.Arrays.sort(arrB);
            
        return java.util.Arrays.equals(arrA, arrB);
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
