package com.string;

import java.util.Scanner;

public class String_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=sc.nextLine();
		System.out.println("\nLenght of the string is :" + str1.length());
		System.out.println("*************************");
		System.out.println("\nEnter the string");
		String str2=sc.nextLine();
		
		System.out.println("\nCombining First and second string : " + str1.concat(" "+str2));
		System.out.println("*************************");
		String str3="java string pool refers to collection of string which are stored in heap memory";
		
		String lower_case= str3.toLowerCase();
		System.out.println("Lower case : " + lower_case);
		
		String upper_case= str3.toUpperCase();
		System.out.println("\nUpper case : " + upper_case);
		
		String replace=str3.replace('a', '$');
		System.out.println("\nReplace : " + replace);
		
		System.out.println("\nIs original string contain word collection ? " + str3.contains("collection"));
	
		String str4="java string pool refers to collection of string which are stored in heap memory";
		
	    if(str3==str4)
	    {
	    	System.out.println("\nString Matches");
	    }
	
	    if(str3.equals(str4))
	    {
	    	System.out.println("\nString Matches");
	    }
	}

}
