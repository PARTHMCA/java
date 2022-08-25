// 7. Write a program to convert temperature from degree centigrade to Fahrenheit.
// (0°C × 9/5) + 32 

import java.util.Scanner;

public class p7{
    public static void main(String[] fah){
        Scanner c  = new Scanner(System.in);

        System.out.print("Enter centigrade : ");
        Float f = c.nextFloat();

        System.out.println("centigrade to Fahrenheit = " + ((f * 9/5) + 32) + "°F");
    }
}