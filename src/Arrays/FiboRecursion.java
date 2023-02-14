package Arrays;

public class FiboRecursion {
	int a=0, b=1, c;
	public void Fibo(int n) {
		if(n == 0)
			return;
		else {
			c = a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
			Fibo(n-1);
		}
	}
	public static void main(String args[]) {
		FiboRecursion ob = new FiboRecursion();
		int n = 10;
		if(n>=3) {
			System.out.print(ob.a+" "+ob.b);
			ob.Fibo(n-2);			
		}
		else {
			System.out.print("Enter range greater than or equal to 3");
		}
	}
}