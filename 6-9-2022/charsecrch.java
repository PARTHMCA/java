import java.util.*;

public class charsecrch {

	public static void main(String[] args) {
		
		System.out.print("Enter Input :- ");
		Scanner sc =  new Scanner(System.in);
		String s = sc.next();
		char ch = s.charAt(0);
		
		if(s.charAt(0) < '0'|| s.charAt(0) > '9') {
		if(s.length()<=1 ) {
		if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
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
