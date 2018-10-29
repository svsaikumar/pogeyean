import java.util.*;
class A2 //selectionsort
{
	static int min = 0;
	static int index = 0;
	public static void main(String[] args) 
	{
		
		int x[] = {10,7,1,5,3,4,2};
		System.out.println(Arrays.toString(x));
		//selection_sort(x);
		System.out.println("*****************************");
		bubble_sort(x);
	}
	public static void bubble_sort(int [] arr)
	{
		for(int i = 0; i < arr.length-1; i++)
		{
			
			for(int j = 0; j < arr.length-1; j++)
			{
				//if(x[j] < x[j+1])-for descending order
				if(arr[j] > arr[j+1]) 
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;	
					
				}	
				
				System.out.println(Arrays.toString(arr));
			}
			System.out.println("=================");
		}
	}
	public static void selection_sort( int [] arr)
	{
		System.out.println(Arrays.toString(arr));
		System.out.println("=================================");
		for(int i = 0; i < arr.length-1; i++)
		{
			index = i;
			for(int j = i + 1; j < arr.length; j++)
			{
				if(arr[j] < arr[index])
				{
					min = arr[j];
					index = j;
				}
				//System.out.println(Arrays.toString(arr));
			}
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i]= temp;
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}
}
