package junit5;

import java.util.Arrays;

public class MinMaxFinder {
	
	public int[] findMinMax(int arr[],int size)
	{
//		int[] a=arr;
//		int n=size;
		int max=arr[0];
		int min=arr[0];
		
		if(size==1)
		{
			min=max=arr[0];
		}
		
		else if(size==2)
		{
		if(arr[0]>arr[1])
		{
			max=arr[0];
			min=arr[1];
		}
		else
		{
			min=arr[0];
			max=arr[1];
		}
		}
		else
		{
		for(int i=0;i<size;i++)
		{
			if(arr[i]>=max)
				max=arr[i];
			else if(arr[i]<min)
				min=arr[i];
		}
		
		}
//        int[] result= {min,max};
//        return result;
		return new int[] {min,max};
		
		
		
	}

}
