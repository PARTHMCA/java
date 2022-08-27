import java.util.Scanner;

public class fibona
{
	public static void main(String[] args) 
	{
       int a = 0 , b = 1;
       Scanner m = new Scanner(System.in);
       System.out.print("Enter number = ");
       int n = m.nextInt();
	    for(int i=0;i<n;i++)
        {
            int c = a + b;
            System.out.print(c);
            if(i<n-1){
                System.out.print(",");
            } else{
                System.out.print(".");
            }
            a = b;
            b = c;
	    }
	}

    @Override
    public String toString() {
        return "fibona []";
    }
}