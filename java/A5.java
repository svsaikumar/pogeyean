import java.util.*;
class A5//queue 
{
	static int front = 0;
	static int rear = 0;
	static int size = 0;
	static int []queue = new int[5];
	static int capacity = queue.length;
	public static void main(String[] args) 
	{
		add(10);
		add(20);
		delete();
		add(30);
		delete();
		add(40);
		show();
		size();
		capacity();
		
	}
	public static void add(int element)
	{
		if(rear == queue.length)
		{
			System.out.println("queue is full");
		}
		else
		{
			queue[rear] = element;
			rear++;
			size++;
		}
	}
	public static void delete()
	{
		if(front == rear)
		{
			System.out.println("queue is empty");
		}
		else
		{
			for(int i = 1; i < queue.length; i++)
			{		
				queue[i-1] = queue[i];			
			}
			size--;
			rear--;
		}
	}
	public static void capacity()
	{
		System.out.println(capacity);
	}
	public static void size()
	{
		System.out.println(size);
	}
	public static void show()
	{
		for(int i= 0; i < size-1; i++)
		{
			System.out.print(queue[i] + ",");
		}
		System.out.println(queue[size-1]);
	}
}
