class Node
{
	int element;
	Node next;
}
class LinkedList
{
	Node head;
	public void add(int element)
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
			current_node.next= node;	
		}
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
			temp = null;
		}
	}
	public void addAt(int  index, int element)
	{
		Node node = new Node();
		node.element = element;
		Node current_node = head;
		for(int i = 0; i < index-1; i++)
		{
			current_node = current_node.next;
		}
		node.next = current_node.next;
		current_node.next = node; 

	}
	public void show()
	{
		Node current_node = head;
		while(current_node.next != null)
		{
			System.out.println(current_node.element);
			current_node = current_node.next;
		}
		System.out.println(current_node.element);
	}
}
public class M2  
{
	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.addAt(2, 50);
		list.show();
		System.out.println("after delete");
		list.deleteAt(1);
		list.show();
	}
}
