import java.util.Scanner;

public class crud {
    public static void main(String[] args){
        
        try (Scanner numbers = new Scanner(System.in)) {
            System.out.print("Enter 1st Number : ");
            Integer no1 = numbers.nextInt();
            System.out.print("Enter 2nd Number : ");
            Integer no2 = numbers.nextInt(); 

// addition, Subtraction, Multiplication and Multiplication
      System.out.println("Addition = " + no1 + " + " + no2  + " = " + (no1+no2));
      System.out.println("Subtraction = " + no1 + " - " + no2  + " = " + (no1-no2));
      System.out.println("Multiplication = " + no1 + " * " + no2  + " = " + (no1*no2));
      System.out.println("Multiplication = " + no1 + " / " + no2  + " = " + (no1/no2));
        }
    }
}
