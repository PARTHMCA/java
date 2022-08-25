import java.util.Scanner;

// 3. Write a program to make a square and cube of number
public class p3{
    public static void main(String[] top){
        Scanner number = new Scanner(System.in);
        System.out.print("Enter Number for Square And Cube : ");
        Integer no1 = number.nextInt();

        System.out.println("Square = " + (no1 * no1) + "   "  + " cube = " + (no1 * no1 * no1));
    }
}