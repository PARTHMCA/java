package over;

import java.util.Scanner;

public class p99 {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.print("Enter the number :- ");
	int i =s.nextInt();
	
	if(i%3==0&&i%5==0) {
		System.out.print(i + " are divisible by 3, 5 and by both");
	}else {
		System.out.print(i + " are not divisible by 3, 5 and by both");
	}
 }
}
