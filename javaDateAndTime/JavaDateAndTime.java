package javaDateAndTime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class JavaDateAndTime {
    // Método
    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE");
        String dayWeek = formatter.format(cal.getTime());
        
        return dayWeek.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        int day = input.nextInt();
        int year = input.nextInt();

        input.close();

        System.out.println(findDay(month, day+1, year));
    }
}
