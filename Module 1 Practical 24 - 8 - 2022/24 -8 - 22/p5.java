// 5. Write a program to find the Area of Triangle 
import java.util.Scanner;

public class p5{
    public static void main(String[] triangle){
        Scanner t = new Scanner(System.in);

        System.out.print("Enter the Heigth : ");
        Float h = t.nextFloat();
        System.out.print("Enter the Width : ");
        Float w = t.nextFloat();

        System.out.println("Area of Triangle = " + ((h*w)/2));
    }
}