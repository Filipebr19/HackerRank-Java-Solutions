package javaStaticInitializerBlock;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    static int B;
    static int H;
    static boolean flag;
    static Scanner scan =  new Scanner(System.in);

    static{
        B  = scan.nextInt();
        H = scan.nextInt();
                scan.close();
        if(B>0 && H>0)
        {
            flag = true;  
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}
}
