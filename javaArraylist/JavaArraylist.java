package javaArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {
    public static void main(String[] args) {
        // My code
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        ArrayList <ArrayList<Integer>> matriz = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            ArrayList<Integer> line = new ArrayList<>();
            int d = input.nextInt();
            
            for(int j = 0; j < d; j++) {
                line.add(input.nextInt());
            }
            matriz.add(line);
        }
        
        int queries = input.nextInt();
        
        for(int i = 0; i < queries; i++) {
            int x = input.nextInt() - 1;
            int y = input.nextInt() - 1;
            
            if(x < matriz.size() && y < matriz.get(x).size()) {
                System.out.println(matriz.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }
    }
}
