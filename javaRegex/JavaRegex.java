package javaRegex;

import java.util.Scanner;

public class JavaRegex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();
    }
}

// My Code
class MyRegex{
    public String pattern = "((25[0-5]|2[0-4]\\d|1\\d{2}|0?\\d{1,2})\\.){3}(25[0-5]|2[0-4]\\d|1\\d{2}|0?\\d{1,2})";
}