package over;

import java.util.Scanner;

public class p55 {
	public static void main(String[] args) {
		
		int i  ,u = 0 ;
		float avg = 0, sum = 0;
		
		
		for(i = 1;i <=5 ;i++) {
			System.out.print("Enter "+ i +" numbers :- ");
			
			Scanner n = new Scanner(System.in);
			 u =n.nextInt();
			
			sum = sum + u ;
		}
		 	avg=sum/5;
		   System.out.println("The sum of 5 no is : " +sum+"\nThe Average is : " +avg);
	}
}
