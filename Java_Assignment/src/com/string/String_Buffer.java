package com.string;

public class String_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer str1= new StringBuffer("StringBuffer");
		
		StringBuffer str2= new StringBuffer(" is a peer class of string");
		StringBuffer str3= new StringBuffer("that provides much of");
		StringBuffer str4= new StringBuffer("the functionality of strings.");
		str1.append(str2).append(str3).append(str4);
		
		System.out.println("combining all four string :\n" +str1);
		
		StringBuffer str5= new StringBuffer("It is used to at the specified index position.");
		System.out.println("\nBefore insert :" + str5);
		str5.insert(14, "insert text");
		System.out.println("\nAfter insert :" + str5);
		
		StringBuffer str6= new StringBuffer("This method returns the reversed object on which it was called.");
		
		System.out.println("\nBefore reversed :"+ str6);
		
		str6.reverse();
		System.out.println("\nAfter reversed :"+ str6);
	}

}
