/* d .write a program you have to find the factorial of given number.*/ 
import java.util.Scanner;
public class Main4{
        public static void main(String[] top){
        long num = 1;
        Scanner m = new Scanner(System.in);
        System.out.print("which number want Factorial = ");
        int n = m.nextInt();
        for(int i=1;i< n; i++)
        {
            num = num * n;
        }
        System.out.printf("Factorial of %d = %d",n, num);
    }
}