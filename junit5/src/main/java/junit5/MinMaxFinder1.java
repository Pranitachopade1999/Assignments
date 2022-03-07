package junit5;

public class MinMaxFinder1 {
	
	public int maxFinder(int arr[],int size)
	{
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		
		return max;	
	}
	
	
	public int minFinder(int arr[],int size)
	{
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		return min;	
	}

}
