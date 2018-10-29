import java.util.*;
class A6//prioruty_queue
{
	
	static int front = 0;
	static int rear = 0;
	static int [] priority_queue = new int[5];
	static int capacity = priority_queue.length;
	public static void main(String[] args) 
	{
		add(20);
		add(10);
		delete();
		add(3);
		add(5);
		delete();
		add(40);	
		show();
	}
	public static void add(int element)
	{
		if(front == priority_queue.length)
		{
			System.out.println("priority_queue is full");
		}
		else
		{
			priority_queue[rear] = element;
			++rear;			
			for(int i = 0; i < rear-1; i++)
			{
				for(int j = 0; j < rear-1; j++)
				{
					if(priority_queue[j] > priority_queue[j+1])
					{
						int temp = priority_queue[j];
						priority_queue[j] = priority_queue[j+1];
						priority_queue[j+1] = temp;
					}				
				}		
			}		
		}
	}
	public static void delete()
	{
		if(front == rear)
		{
			System.out.println("priority_queue is empty");
		}
		else
		{
			for(int i = 0; i < rear; i++)
			{
				priority_queue[i] = priority_queue[i+1];
			}	
			--rear;
		}
	}
	public static void size()
	{
		System.out.println("size is:" + rear);
	}
	public static void capacity()
	{
		System.out.println("capacity is:" + capacity);
	}
	public static void show()
	{
		for(int i = 0; i < rear-1; i++)
		{
			System.out.print(priority_queue[i] + ",");
		}
		System.out.println(priority_queue[rear-1]);
	}
}
 