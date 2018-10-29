class palindrome
{
	static int num = 232; static int sum = 0; static int reverse; static int num1 = num;
	public static void main(String[] args) 
	{


		while(num != 0)
		{
			sum = num % 10;
			reverse = (reverse * 10) + sum;
			num = num /10;
		}
		
		if(num1 == reverse)
		{
			System.out.println("digits " + num1 + " is palindrome ");
		}
		else
		{
			System.out.println("digits " + num1 + " is not palindrome");
		}
	}
}
