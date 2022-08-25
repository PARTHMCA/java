//8. Write a program to calculate sum of 5 subjects & find the percentage. Subject marks.
import java.util.Scanner;
public class p8{
    public static void main(String[] top){
        Scanner s = new Scanner(System.in);

        
        System.out.print("Enter marks subject 1 : ");
        float s1 = s.nextFloat();
        System.out.print("Enter marks subject 2 : ");
        float s2 = s.nextFloat();
        System.out.print("Enter marks subject 3 : ");
        float s3 = s.nextFloat();
        System.out.print("Enter marks subject 4 : ");
        float s4 = s.nextFloat();
        System.out.print("Enter marks subject 5 : ");
        float s5 = s.nextFloat();
 
        System.out.println("Total Marks = " + (s1+s2+s3+s4+s5) );
        float t = (s1+s2+s3+s4+s5)/(5);
        System.out.println("percentage = " + t);

    }

   
}