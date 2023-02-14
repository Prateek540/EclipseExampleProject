package CircularList;

public class CircularLinkedList {
	Node head, tail;
	int size = 0;
	
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			next = null;
			size++;
		}
	}
	
	void DeleteAtFront()
	{
		if(head == null)
		{
			System.out.println("Empty Circular LinkedList");
		}
		else
		{
			head = head.next;
			tail.next = head;
		}
	}
	
	void DeleteAtEnd()
	{
		if(head == null)
		{
			System.out.println("Empty Circular LinkedList");
		}
		else
		{
			Node temp = head;
			while(temp.next != tail)
			{
				temp = temp.next;
			}
			temp.next = head;
			tail = temp;
		}
	}
	
	void DeleteAtPos(int pos)
	{
		if(pos == 1)
		{
			DeleteAtFront();
		}
		else if(pos == size)
		{
			DeleteAtEnd();			
		}
		else if(pos < 1 || pos > size)
		{
			System.out.println("Invalid position cannot be deleted");
		}
		else
		{
			Node temp = head;
			int i=0;
			while(i<pos-2)
			{
				i++;
				temp = temp.next;
			}
			temp.next = temp.next.next;
		}
	}
	
	void AddAtFront(int n)
	{
		Node newnode = new Node(n);
		if(head == null)
		{
			head = tail = newnode;
			tail.next = head;
		}
		else
		{
			tail.next = newnode;
			newnode.next = head;
			head = newnode;
		}
	}
	
	void AddAtEnd(int n)
	{
		Node newnode = new Node(n);
		if(head == null)
		{
			head = tail = newnode;
			tail.next = head;
		}
		else
		{
			newnode.next = head;
			tail.next = newnode;
			tail = newnode;
		}
	}
	
	void AddAtPos(int n, int pos)
	{
		if(pos == 1)
		{
			AddAtFront(n);
		}
		else if(pos == size+1)
		{
			AddAtEnd(n);			
		}
		else if(pos < 1 || pos > size+1)
		{
			System.out.println("Invalid position");
		}
		else
		{
			Node newnode = new Node(n);
			Node temp = head;
			int i=0;
			while(i<pos-2)
			{
				i++;
				temp = temp.next;
			}
			newnode.next = temp.next;
			temp.next = newnode;
		}
	}
	
	void Display()
	{
		System.out.println("Circular Linked List with all elements are ");
		Node temp = head;
		do
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		while(temp != head);
	}
	
	public static void main(String args[])
	{
		CircularLinkedList ob = new CircularLinkedList();
		ob.AddAtEnd(1);
		ob.AddAtEnd(2);
		ob.AddAtEnd(3);
		ob.AddAtEnd(4);
		ob.Display();
		ob.AddAtFront(5);
		ob.AddAtFront(6);
		ob.AddAtFront(7);
		ob.AddAtFront(8);
		ob.Display();
		ob.AddAtPos(9, 5);
		ob.AddAtPos(10, 6);
		ob.Display();
		ob.DeleteAtFront();
		ob.DeleteAtEnd();
		ob.Display();
		ob.DeleteAtPos(3);
		ob.Display();
	}
}