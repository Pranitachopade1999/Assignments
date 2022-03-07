package com.string;

public class String_Builder {

	public static void main(String[] args) {
			// TODO Auto-generated method stub

			StringBuilder str1= new StringBuilder("StringBuilder");
			
			StringBuilder str2= new StringBuilder(" is a peer class of string");
			StringBuilder str3= new StringBuilder("that provides much of");
			StringBuilder str4= new StringBuilder("the functionality of strings.");
			str1.append(str2).append(str3).append(str4);
			
			System.out.println("combining all four string :\n" +str1);
			
			StringBuilder str5= new StringBuilder("It is used to at the specified index position.");
			System.out.println("\nBefore insert :" + str5);
			str5.insert(14, "insert text");
			System.out.println("\nAfter insert :" + str5);
			
			StringBuilder str6= new StringBuilder("This method returns the reversed object on which it was called.");
			
			System.out.println("\nBefore reversed :"+ str6);
			
			str6.reverse();
			System.out.println("\nAfter reversed :"+ str6);
		}

	}

	
