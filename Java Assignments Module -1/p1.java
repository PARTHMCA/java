import java.util.*;

public class p1 {
 public static void main(String[] args) {
	 
	 Scanner s12 = new Scanner(System.in);
	 System.out.print("first number Input :- ");
	 int s1 = s12.nextInt();
	 System.out.print("sec number Input :- ");
	 int s2 = s12.nextInt();
	 System.out.print("third number Input :- ");
	 int s3 = s12.nextInt();

	 
	 if (s1 > s3 && s1 > s3)
	      System.out.println(s1 + " First number is the largest.");
	    else if (s2 > s1 && s2 > s3)
	      System.out.println(s2 + " Second number is the largest.");
	    else if (s3 > s1 && s3 > s2)
	      System.out.println(s3 + " Third number is the largest.");
	    else
	      System.out.println("The numbers are not distinct.");
	
 }
}