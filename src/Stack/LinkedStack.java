package Stack;
import java.util.*;
public class LinkedStack {
	Node head, temp;
	class Node{
		Node next;
		int data;
	Node(int n){
		data = n;
		next = null;
	}
	}
	void Push() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your data in stack");
		int data = sc.nextInt();
		Node newnode = new Node(data);
		if(head == null) {
			head = newnode;
			temp = newnode;
		}
		else {
			temp.next = newnode;
			temp = newnode;
		}
		System.out.println(data+" data entered in stack");
		sc.close();
	}
	void Pop() {
		if(head == null) 
			System.out.println("Empty Stack");
			else {
				System.out.println("Element removed is "+head.data);
				head = head.next;
			}
	}
	void Display() {
		Node newnode = head;
		if(newnode == null) {
			System.out.println("EMPTY Stack");
		}
		else {
		while(newnode != null) {
			System.out.println(newnode.data);
			newnode = newnode.next;
		}
		}
	}
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		char ch='y';
		LinkedStack ob = new LinkedStack();
		do
		{
			System.out.println("Enter 1 to push 2 to pop 3 for display");
			int n = sc.nextInt();
			if(n==1) {
				ob.Push();
			}
			else if(n==2) {
				ob.Pop();
			}
			else if(n==3) {
				ob.Display();
			}
			else
				System.out.println("Wrong choice try again");
			System.out.println("Want to continue press Y or y");
			ch = (sc.next()).charAt(0);
		}
		while(ch == 'Y' || ch == 'y');
	}
}