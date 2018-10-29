class prime_number 
{
	public static void main(String[] args) 
	{
		boolean flag = false;




		for(int i = 3; i <= 100; i++)
		{
			for(int j = i-1; j > 1; j--)
			{
				if(i % j != 0)
				{
					flag = true;
				}
				else if(i % j == 0)
				{
					flag = false;
					break;
				}
			}
			if(flag == true)
			{
				System.out.println(i + ",");
			}
		}
		System.out.println("Hello World!");
	}
}
