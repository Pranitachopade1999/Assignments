package com.oops_assignment;



//public class Abstract_Class {    :- //The abstract method run in type Abstract_Class can only be
                                      //defined by an abstract class

//abstract private class Abstract_Class{   :-  Illegal modifier for the class Abstract_Class; 
                                               //only public, abstract & final are permitted  
	
//abstract final class Abstract_Class{   :-   The class Abstract_Class can be either abstract or final, not both
    

abstract class Abstract_Class{
     void print()
	{
		System.out.println("You can declare a class abstract without"+ " having any abstract method.");
	}
	
	abstract void run();
	
	public static void main(String[] args) {
		
		//Abstract_Class ab=new Abstract_Class(); //Cannot instantiate the type Abstract_Class
	
	}

}

//class shape extends Abstract_Class   // 1. Add unimplemented method or 2. Make type shape as abstract

class shape extends Abstract_Class
{

	@Override
	void run() {
		// TODO Auto-generated method stub
		
	}
	
}
