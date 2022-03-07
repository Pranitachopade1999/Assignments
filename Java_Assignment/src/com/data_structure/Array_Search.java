package com.data_structure;

import java.util.Scanner;

public class Array_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int num=sc.nextInt();
		System.out.println("Enter the values in array :");
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
		 arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number you want to search :");
		int value=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			if(arr[i]==value)
			{
				System.out.println(value + " is present in the array");
			}
			
		}
		
		
	}

}
