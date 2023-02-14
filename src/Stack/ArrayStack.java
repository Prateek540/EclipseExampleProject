package Stack;
import java.util.*;

public class ArrayStack {
	int[] arr;
	int size, top;
	ArrayStack(int size)
	{
		this.size = size;
		top = -1;
		arr = new int[size];
	}
	void Push(int n)
	{
		if(top == size-1)
		{
			System.out.println("STACK OVERFLOW");
		}
		else
		{
			arr[++top] = n;
			System.out.println(n+ " IS ADDED IN STACK");
		}
	}
	
	void Pop()
	{
		if(top == -1)
		{
			System.out.println("STACK UNDERFLOW");
		}
		else
		{
			System.out.println(arr[top--]+" IS REMOVED FROM STACK");
		}
	}
	
	void Peek()
	{
		if(top == -1)
			System.out.println("STACK UNDERFLOW");
		else
			System.out.println(arr[top]+" IS THE TOP ELEMENT");
	}
	
	void Display()
	{
		System.out.println("STACK ELEMENTS ARE --->");
		for(int i = top; i >= 0 ; i--)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of stack");
		int n = sc.nextInt();
		char ch;
		ArrayStack ob = new ArrayStack(n);
		do
		{
			System.out.println("Press 1 for push 2 for pop 3 for peek 4 for display");
			int choice = sc.nextInt();
			if(choice == 1)
			{
				System.out.println("Enter the element to push");
				int element = sc.nextInt();
				ob.Push(element);
			}
			else if(choice == 2)
			{
				ob.Pop();
			}
			else if(choice == 3)
			{
				ob.Peek();
			}
			else if(choice == 4)
			{
				ob.Display();
			}
			else
				System.out.println("Wrong choice try again!!!");
			System.out.println("Want to continue press Y or y");
			ch = (sc.next()).charAt(0);
		}
		while(ch == 'Y' || ch == 'y');
		sc.close();
	}
}
