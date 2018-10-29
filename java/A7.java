class A7//stack 
{
	static int bottom = 0;
	static int top = 0;
	static int [] stack = new int[5];
	static int capacity = stack.length;
	public static void main(String[] args) 
	{
		add(10);
		add(20);
		add(30);
		delete();
		show();
		size();
		capacity();
		add(40);
		show();
		size();
		capacity();
		delete();
		show();
	}
	public static void add(int element)//stack
	{
		if(top == stack.length)
		{
			System.out.println("stack is full");
		}
		else
		{
			stack[top] = element;
			top++;
		}
	}
	public static void delete()//stack
	{
		if(top == 0)
		{
			System.out.println("stack is empty");
		}
		else
		{
			stack[top] = stack[top-1];
			top--;
		}
	}
	public static void size()
	{
		System.out.println("size is:" + top);
	}
	public static void capacity()
	{
		System.out.println("capacity is:" + capacity);
	}
	public static void show()
	{
		System.out.println(stack[top-1]);
		for(int i = top-2; i >=0; i--)
		{
			System.out.println(stack[i]);
		}		
	}
}
