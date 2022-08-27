import java.util.Scanner;

// h .Write a program to find out the max from given number (E.g. No: -1562 Max number is 6 )

public class Main8{
    public static void main(String[] top){
        int max = 0 , temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number : ");
        int  num = s.nextInt();

        while(num > 0){
            temp = num%10;
            if(temp>max){
                max = temp;
            }
            num = num / 10;
        }
        System.out.print(max);
    }
}