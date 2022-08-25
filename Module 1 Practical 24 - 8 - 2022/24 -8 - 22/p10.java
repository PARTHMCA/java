import java.util.Scanner;

//10. Write a Program to check the given number is Positive, Negative.

public class p10{
    public static void main(String[] top){
        Scanner n = new Scanner(System.in);

        System.out.print("Enter the Any Number check ( Positive, Negative , zero ) : ");
        Float c = n.nextFloat();

        if(c <= -1){
            System.out.println(c + " is Negative");
        }else if(c >= 1){
            System.out.println(c + " is Positive");
        }else{
            System.out.println(c + " is zero");
        }


    }
}