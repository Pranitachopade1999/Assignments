package com.generics;

import java.util.List;

public class Array_Generics {

	public <T> void swap(T[] arr, int i,int j)
	{
		T temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Array_Generics ag= new Array_Generics();
		
		Integer[] num= {5,10,20,25,30};
		System.out.println("Before Swap");
		
		for(Integer i: num)
		System.out.print(i+ " ");
		System.out.println("\n*****************************");
		ag.swap(num, 0, 4);
		System.out.println("After Swap :" );
		
		for(Integer i: num)
			System.out.print(i+ " ");
		
		
		
	}

}
