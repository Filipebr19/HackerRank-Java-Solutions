package javaEndOfFile;

import java.util.Scanner;

public class JavaEndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int countLine = 1;
        
        while(input.hasNext()) {
            System.out.println(countLine +" "+ input.nextLine());
            countLine++;
        }
        input.close();
    }
}
