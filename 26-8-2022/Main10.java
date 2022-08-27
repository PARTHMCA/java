import java.util.Scanner;

// j. Write a program you have to make a summation of first and last Digit. (E.g. 1234 ans:-5)

public class Main10{
    public static void main(String[] top){
        int sum = 0 , digit = 0 ;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = s.nextInt();

        digit = num%10;
        sum = (sum*10)+digit;

        while(num > 0){
            if(num > 9)
                num = num / 10;

            else{
                digit = num;
                sum = sum + digit;
                num = num/10;
            }
        }
            System.out.print(sum);
    }
}
