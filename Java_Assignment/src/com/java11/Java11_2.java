package com.java11;
import java.util.ArrayList;

@FunctionalInterface
interface Interf
{
	public void add(int a,int b);
}

@FunctionalInterface
interface Interf1
{
	public void add1(int a);
}


public class Java11_2 {

	// var x=50;
	// var cannot be used in an instance and global variable declaration
	 public static void main(String[] args) {
		 Java11_2 m=new Java11_2();
		 
	 var x =50; //this is acceptable
	 
	 //var s; //Cannot use 'var' on variable without initializer
	 
	// Interf i=(var a,b)->System.out.println(a+b);
	//No skipping allowed
	 
	 Interf i=(var a,var b)->System.out.println(a+b); //allowed
	 
	 //Interf i=(var a,int b)->System.out.println(a+b);
	 //var cannot be mixed with non-var 
	 
	 Interf1 i1=(var a)->System.out.println(a);//allowed
	 
	// Interf1 i1=var a->System.out.println(a);
	 //Not allowed need parenthesis if you use var in lambda
	
	 }
}