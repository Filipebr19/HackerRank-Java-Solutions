package javaBigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {
    public static void main(String[] args) {
        // My code
        Scanner input = new Scanner(System.in);
        BigInteger a = new BigInteger(input.next());
        BigInteger b = new BigInteger(input.next());
        input.close();
        
        BigInteger sum = a.add(b);
        System.out.println(sum);
        
        BigInteger bigNumber = a.multiply(b);
        System.out.println(bigNumber);
    }
}
