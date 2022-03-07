package com.oops_assignment;

/*Implicit super constructor Singleton() is not visible for default constructor. 
Must define an explicit constructor.*/

//public class Singleton_Class extends Singleton{

public class Singleton_Class {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Gives compile time error the constructor Singleton() not visible
		//Singleton s1= new Singleton();
		
		Singleton s1=  Singleton.getInstance();
		
		
	}

}

class Singleton
{
	static Singleton s= new Singleton();
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		return s;
	}
}
