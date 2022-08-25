//6. Write a program to find the simple Interest

import java.util.Scanner;

public class p6{
    public static void main(String[] simple){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Principal amount : ");
        Float p = s.nextFloat();
        System.out.print("Enter Rate of interest : ");
        Float i = s.nextFloat();
        System.out.print("Enter Time (in years) : ");
        Float t = s.nextFloat();

        System.out.println("simple Interest = " + ((p * i * t)/100));
    } 

}