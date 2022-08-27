import java.util.Scanner;

public class Main2{
    public static void main(String[] top){
        Scanner w = new Scanner(System.in);
        System.out.print("Enter the Staring number = ");
        int s = w.nextInt();
        System.out.print("Enter the ending number = ");
        int e = w.nextInt();

        for(int i = s; i <= e ; i++){
            System.out.print(i + " ");
        }
    
    }
}