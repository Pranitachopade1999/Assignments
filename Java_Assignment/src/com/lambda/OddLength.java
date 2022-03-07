package com.lambda;
import java.util.ArrayList;
import java.util.List;

public class OddLength {

	public static void main(String[] args) 
		{
			List<String> li=new ArrayList<>();
			li.add("Pranita");
			li.add("Khushi");
			li.add("Radha");
			li.add("Lahu");
			
			
			System.out.println("Elements in the list are:\n");
			
			for (String i : li) {
				System.out.println(i);
			}
	
			li.removeIf(a->(a.length()%2 !=0));
			System.out.println("\nElements in the list with odd lengths are:\n");
			
			for (String i : li) {
				System.out.println(i);
			}
			}
	}


