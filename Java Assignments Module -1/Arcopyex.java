package over;

public class Arcopyex {
	public static void main(String[] tops) {
		
		int A[] = {10,20,30,40,50};
		int B[] = {60,70,80,90,100} ;
		
		System.arraycopy(B,0,A,0,5);
		
		for(int i=0;i<10;i++)
		{
			System.out.println(A[i]);
		}
		
	}
}
