package javaLoopsI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoopsI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        for(int i = 1; i <= 10; i++) {
            int res = N * i;
            
            System.out.printf("%d x %d = %d", N, i, res);
            System.out.println("");
        }
    }
}
