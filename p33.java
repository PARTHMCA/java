package over;

//Write a Java program that takes a year from user and print whether that 
//year is a leap year or not.

import java.util.*;

public class p33 {
	public static void main(String[] args) {
	
		Scanner i = new Scanner(System.in);
		System.out.print("Enter the years :- ");
		int year = i.nextInt();
		
		if(year%100 == 0 && year%400 == 0||year%100 == 0 && year% 4 == 0) {
			System.out.print(year +" is leap year");
		}else {
			System.out.print(year +" is leap not year");
		}
	}
		
}

