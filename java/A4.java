class A4//quick sort 
{
	public static void Quicksort(int [] arr, int left, int right)
	{
		int index = partition(arr, left, right);
		
		if(left < index-1)
		{
			Quicksort(arr,left, index-1);
		}
		if(index < right)
		{
			Quicksort(arr, index, right);
		}
	}

	public static int partition(int []arr, int left, int right)
	{
		int pivot = arr[(left + right)/2];

		while(left<= right)
		{
			while(arr[left] < pivot)
			{
				left++;
			}
			while(arr[right] > pivot)
			{
				right--;
			}
			if(left <= right)
			{
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;

				left++;
				right--;
			}
		}
		return left;
	}
	public static void main(String[] args) 
	{
		int [] array = new int[]{10,9,8,6,4,1};
		Quicksort(array, 0, array.length -1);
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
	}
}

