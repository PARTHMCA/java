import java.util.Scanner;

// g. Write a program to print the number in reverse order.

public class Main6{
    public static void main(String[] top){

        int re = 0;
        Scanner n = new Scanner(System.in);
        System.out.print("Enter number = ");
        int r = n.nextInt();

        while(r!=0){
        int rm = r % 10;
        re = re * 10 + rm ;
        r = r/10;   
        }

        System.out.println("The reverse of the given number is: " + re);
    }
}