import java.util.*;
class  A3//insertion sort
{
	public static void main(String[] args) 
	{
		int x[] = {20,25,10,8,6,14};
		insertion_sort(x);
	}


	public static void insertion_sort(int []arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			for(int j = i+1; j  > 0 ; j--)
			{
				if(arr[j] < arr[j-1])
				{
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}
}
