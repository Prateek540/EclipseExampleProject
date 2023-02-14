package Queue;
import java.util.*;
public class ArrayQueue {
	
	int front, rear, size, capacity;
	int arr[];
	
	ArrayQueue(int capacity){
		this.capacity = capacity;
		front = rear = -1;
		size = 0;
		arr = new int[this.capacity];		
	}
	
	void Enqueue(int n)
	{
		if(rear == capacity - 1)
			System.out.println("Queue is Full");
		else if(front == -1 && rear == -1)
		{
			System.out.println("Element "+n+ " is inserted");
			front = rear = 0;
			arr[rear] = n;
			size++;
		}
		else
		{
			System.out.println("Element "+n+ " is inserted");
			rear++;
			arr[rear] = n;
			size++;
		}
	}
	
	void Dequeue()
	{
		if(front == -1||front > rear)
			System.out.println("Queue is Empty");
		else
		{
			System.out.println("Element "+arr[front]+ " is deleted");
			front++;
			size--;
		}
	}
	
	void Display()
	{
		System.out.println("Queue all elements are");
		if(front == -1 || front > rear)
		{
			System.out.println("EMPTY");
		}
		else
		{
		for(int i=front;i<=rear;i++)
		{
			System.out.println(arr[i]);
		}
		}
	}
	
	public static void main(String args[])
	{
		int n, choice, x;
		char ch = 'y';
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter capacity of queue");
		n = sc.nextInt();
		ArrayQueue aq = new ArrayQueue(n);
		do
		{
			System.out.println("Enter 1 to enqueue 2 for dequeue 3 for display");
			choice = sc.nextInt();
			if(choice == 1)
			{
				System.out.println("Enter data to be inserted");
				x = sc.nextInt();
				aq.Enqueue(x);
			}
			else if(choice == 2)
			{
				aq.Dequeue();
			}
			else if(choice == 3)
			{
				aq.Display();
			}
			else
				System.out.println("Wrong choice");
			System.out.println("Enter y or Y to continue");
			ch = sc.next().charAt(0);
		}
		while(ch == 'Y' || ch == 'y');
		sc.close();
	}
}