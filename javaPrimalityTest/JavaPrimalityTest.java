package javaPrimalityTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaPrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        
        // My code
        BigInteger num = new BigInteger(n);
        if(num.isProbablePrime(100)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        };
    }
}
