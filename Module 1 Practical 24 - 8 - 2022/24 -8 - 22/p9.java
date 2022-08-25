// 9. Write a Program to show swap of two No's without using third variable.
import java.util.Scanner;

class p9 {  
 public static void main(String arg[]) {  

 Scanner z = new Scanner(System.in);
 System.out.print("Enter Number x = ");
 Integer x = z.nextInt();
 System.out.print("Enter Number y = ");
 Integer y = z.nextInt();

 System.out.println(" --- Before swapping --- ");  

  System.out.println("value of x : " + x);  
  System.out.println("value of y : " + y);  
  System.out.println(" --- After swapping ---");  
  x = x + y;  
  y = x - y;  
  x = x - y;  
  System.out.println("value of x : " + x);  
  System.out.println("value of y : " + y);  
 }  
}  