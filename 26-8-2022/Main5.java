//f. write a program you have to print the table of given number.
import java.util.Scanner;

public class Main5{
     
    public static void main(String[] top){

        Scanner t = new Scanner(System.in);
        System.out.print("which table want = ");
        int n = t.nextInt();

        for(int i=1;i<=10;++i){
            System.out.println(n + " * " + i +  " = " + n * i);    
        }    
    }
}