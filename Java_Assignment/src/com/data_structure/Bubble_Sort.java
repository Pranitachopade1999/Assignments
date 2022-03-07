package com.data_structure;

public class Bubble_Sort {
  
	void bubble_sort(int arr[])
	{
	int n=arr.length;
	for(int i=0;i<n-1;i++)
	{
		for(int j=0;j<n-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				int temp= arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	}
	
	void print(int arr[])
	{
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Bubble_Sort bs= new Bubble_Sort();
    int[] arr= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
    System.out.println("Array Before Sorted : ");
    for(int i=0;i<arr.length;i++)
    System.out.print(arr[i] + " " );
    bs.bubble_sort(arr);
    System.out.println("\n\nArray After Sorted : ");
    bs.print(arr);
		
		
		
	}

}
