package com.lambda;

@FunctionalInterface
interface Arithmetic
{
	 int performOperation(int a,int b);
}

public class Arithmetic_Op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Arithmetic add=(a,b)->(a+b);
		System.out.println("Addition :" + add.performOperation(10, 10));
		
		Arithmetic sub=(a,b)->(a-b);
		System.out.println("Subtraction : " + sub.performOperation(20, 5));
		
		Arithmetic mul=(a,b)->(a*b);
		System.out.println("Multiplication : "+ mul.performOperation(10, 10));
		
		Arithmetic div=(a,b)->(a/b);
		System.out.println("Division : "+ div.performOperation(25, 5));
	}

}

