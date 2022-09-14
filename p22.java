//Write a Java program that takes the user to provide a single character 
//from the alphabet. Print Vowel or Consonant, depending on the user 
//input. If the user input is not a letter (between a and z or A and Z), or is a 
//string of length > 1, print an error message

package over;

import java.util.Scanner;

public class p22 {
	public static void main(String[] args) {
		System.out.print("Enter Input :- ");
		Scanner sc =  new Scanner(System.in);
		String s = sc.next();
		char ch = s.charAt(0);
		
		if(s.charAt(0) < '0'|| s.charAt(0) > '9') {
		if(s.length()<=1 ) {
		if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch == 'A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
			System.out.println(s  + " is " + "Vowel");
			}
			else
			{
				System.out.println(s  + " is " +  " Consonant");
			}
			}else 
				{
				System.out.println(s  + " is " + "Invalid Input !! Input only one character !");
				}
			}else 
			{
				System.out.println(s  + " is " + " numerical !! Input only character !");
			}
	}
}
