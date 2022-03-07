package com.lambda;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InbuiltInterface {
	static String s2="Pranita";
			public static void main(String[] args) {
				
				Supplier<Integer> s1 = ()->s2.length();
				Predicate<Integer> p = i->i>50;
				Consumer<Integer> c = (j)->System.out.println(j);
				Function<Integer,Double> f =(a)->a/2.7;
				
				System.out.println("Using Supplier Functional Interface");
				System.out.println(s1.get());
				
				System.out.println("\nUsing Predicate Functional Interface");
				System.out.println(p.test(40));
			
				System.out.println("\nUsing Consumer Functional Interface");
				c.accept(1234);
			
				System.out.println("\nUsing Function Functional Interface");
				System.out.println(f.apply(467));
	
			}
		}

