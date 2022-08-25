import java.util.Scanner;

public class info{
    public static void main(String[] info){
        try (Scanner nam = new Scanner(System.in)) {
            System.out.print("What is your Name : ");
            String n = nam.nextLine();
            System.out.print("What is your Birth date : ");
            String b = nam.nextLine();
            System.out.print("What is your Address : ");
            String s = nam.nextLine();
            System.out.print("What is your Age : ");
            String a = nam.nextLine();  

            System.out.println("Name : " + n);
            System.out.println("Birth date : " + b);
            System.out.println("Address : " + s);
            System.out.println("Age : " + a);
        }
        
    }
}