0class Node 
{
	int element;
	Node next;
}
class LinkedList
{
	Node head;
	public void add(int element)//add(50)
	{
		Node node = new Node();
		node.element = element;
		node.next = null;

		if(head == null)
		{
			head = node;
		}
		else
		{
			Node current_node = head;
			while(current_node.next != null)
			{
				current_node = current_node.next;
			}
			current_node.next = node;
		}
	}
	public void insertAtStart(int element)
	{
		Node node = new Node();
		node.element = element;
		node.next = head;
		head = node;
	}
	public void insertAt(int index, int element)
	{
		if(index == 0)
		{
			insertAtStart(element);
		}
		else
		{
			Node node = new Node();
			node.element = element;
			node.next = null;

			Node current_node = head;
			for(int i = 0; i < index-1; i++)
			{
				current_node = current_node.next;
			}
			node.next = current_node.next;
			current_node.next = node;
		}
	}
	public void deleteFirst()
	{
		head = head.next;
	}
	public void deleteAt(int index)
	{
		
		if(index == 0)
		{
			head = head.next;
		}
		else
		{
			Node current_node = head;
			Node temp = null;
			for(int i = 0; i < index-1; i++)
			{
				current_node = current_node.next;
			}
			temp = current_node.next;
			current_node.next = temp.next;
			System.out.println("temp is :" + temp.element);
			temp = null;
		}
	}
	
	public void show()
	{
		Node node = head;
		while(node.next != null)
		{
			System.out.println(node.element);
			node = node.next;
		}
		System.out.println(node.element);
	}
	
}
public class M1
{
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		//list.insertAtStart(10);
		//list.insertAt(0, 30);
		list.show();
		System.out.println("after delete");
		//list.deleteLast();	
		list.show();
	}
}
