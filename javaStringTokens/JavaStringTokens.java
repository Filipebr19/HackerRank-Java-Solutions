package javaStringTokens;

import java.util.Scanner;

public class JavaStringTokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        
        s = s.trim();
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }
        String[] words = s.split("[\\s!,?._'@]+");
        
        System.out.println(words.length);
        for(String word : words) {
            System.out.println(word);
        }
    }
}
