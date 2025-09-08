package javaLoopsII;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        double res = 0;
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            res = a + Math.pow(2, 0) * b;
            
            System.out.printf("%d ", (int)res); 
            for(int j = 1; j < n; j++) {
                res += Math.pow(2, j) * b;
                System.out.printf("%d ", (int)res);
            }
            System.out.println("");
        }
        in.close();
    }
}
