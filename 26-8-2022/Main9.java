import java.util.Scanner;

// i. Write a program make a summation of given number(E.g. 1523 ans :-11)

public class Main9{
    public static void main(String[] top){
        int  digit = 0 ;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = s.nextInt();

        while(num > 0){
            digit = digit + num%10;
            num = num/10;
        }
        System.out.print(digit);
    }
}