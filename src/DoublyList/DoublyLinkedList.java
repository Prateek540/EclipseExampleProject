package DoublyList;
/*
 * temp=null,current=head;
 * while(current!=NULL) {
 * temp = current.prev;
 * current.prev=current.next;
 * current.next = temp;
 * current=current.prev;
 * }
 * if(temp!=NULL)
 * head=temp.prev;
 */
public class DoublyLinkedList {
	Node head, tail;
	int size = 0;
	class Node
	{
		int data;
		Node prev;
		Node next;
		Node(int data)
		{
			this.data = data;
			prev = null;
			next = null;
			size++;
		}
	}
	
	void DeleteAtFront()
	{
		if(head == null)
			System.out.println("Empty LinkedList");
		else
		{
			head = head.next;
			size--;
		}
	}
	
	void DeleteAtEnd()
	{
		if(head == null)
			System.out.println("Empty LinkedList");
		else
		{
			tail = tail.prev;
			tail.next = null;
			size--;
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
			Node temp1 = head, temp2;
			int i=0;
			while(i<pos-2)
			{
				i++;
				temp1 = temp1.next;
			}
			temp2 = temp1.next.next;
			temp1.next = temp2;
			temp2.prev = temp1;
			size--;
		}
	}
	
	void AddAtFront(int n)
	{
		Node newnode = new Node(n);
		if(head == null)
		{
			head = newnode;
			tail = newnode;
		}
		else
		{
			newnode.next = head;
			head.prev = newnode;
			head = newnode;
		}
	}
	
	void AddAtEnd(int n)
	{
		Node newnode = new Node(n);
		if(head == null)
		{
			head = newnode;
			tail = newnode;
		}
		else
		{
			tail.next = newnode;
			newnode.prev = tail;
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
			Node temp1 = head, temp2;
			int i=0;
			while(i<pos-2)
			{
				i++;
				temp1 = temp1.next;
			}
			temp2 = temp1.next;
			temp1.next = newnode;
			temp2.prev = newnode;
			newnode.prev = temp1;
			newnode.next = temp2;
		}
	}
	
	void Display()
	{
		System.out.println("Doubly Linked List with all elements are ");
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String args[])
	{
		DoublyLinkedList ob = new DoublyLinkedList();
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
