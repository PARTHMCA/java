import java.util.Scanner;

// c. write a program to print the 100 to 81 using do....while loop

public class Main3{
    public static void main(String[] top){
        Scanner w = new Scanner(System.in);
        System.out.print("Reverse Staring point = ");
        int s = w.nextInt();
        System.out.print("Reverse Ending point = ");
        int e = w.nextInt();
       int i = s;
        do{
            System.out.print(i + " ");
            i-- ;
        }while(i>=e);
    }
}