package com.lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;


class MyOperator implements UnaryOperator<String>
{
	@Override
	public String apply(String t) 
	{
		return t.toUpperCase();
	}
}


public class UpperCaseEquivalent {

	public static void main(String[] args)
		{
			List<String> l=new ArrayList<>();
			l.add("Pranita");
			l.add("Khushi");
			l.add("Radha");
			l.add("Rani");
			System.out.println("Elements in list are:\n");
			for(String i: l)
				System.out.println(i);
			
			l.replaceAll(new MyOperator());
			
			System.out.println("\nElements in list after replacing with upper case letters are:\n");
			for(String i: l)
				System.out.println(i);
			}

	

}
