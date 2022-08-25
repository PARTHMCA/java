import java.util.Scanner;

// 4. Write a program to find the Area of Circle

public class  p4{
    public static void main(String[] tops){
        Scanner r1 = new Scanner(System.in);
        
        System.out.print("Enter the redius : ");
        Float redius = r1.nextFloat();

        System.out.println("Area of Circle = " + (3.14 * redius * redius));
    }
}