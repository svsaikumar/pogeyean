import java.util.Arrays;
class A1//bubble_sort
{
	public static void main(String[] args) 
	{
		int []x = {10,5,8,1,3};

		bubble_sort(x);
	}

	public static void bubble_sort(int []arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{	
			for(int j = 0; j < arr.length-1; j++)
			{
				if(arr[j] > arr[j+1]) 
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;

				}			
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
