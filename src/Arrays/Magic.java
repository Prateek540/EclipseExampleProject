package Arrays;
import java.util.*;

public class Magic {
	public static void main(String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.");
		n = sc.nextInt();
		while(n>9)
		{
			n = sum(n);
		}
		if(n==1)
			System.out.println("Magic no.");
		else
			System.out.println("Not a Magic no.");
		sc.close();
	}
	public static int sum(int n)
	{
		int d,s=0;
		while(n>0)
		{
			d = n%10;
			s = s+d;
			n = n/10;
		}
		return s;
	}
}