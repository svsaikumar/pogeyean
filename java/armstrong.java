class armstrong 
{
	public static void main(String[] args) 
	{



		int num= 153;int sum = 0;int num1 = num;
		while(num!=0)
		{
			int n1 = (num % 10);
			sum = sum  + (n1 * n1 *n1);
			num = num/10;
		}
		if(num1 == sum)
		{
			System.out.println("given number is armstrong");
		}
		else
		{
			System.out.println("given number is not an armstrong");
		}
	}
}
