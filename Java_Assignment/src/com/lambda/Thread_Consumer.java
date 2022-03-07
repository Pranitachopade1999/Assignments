package com.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;


public class Thread_Consumer {

	public static void main(String[] args)
		{
			Consumer<Integer> display = (i)->System.out.println(i);
			List<Integer> l = new ArrayList<>();
			l.add(1);
			l.add(2);
			l.add(3);
			l.add(4);
			l.add(5);
			
			Iterator i=l.iterator();
			while(i.hasNext())
			{       
			    Integer in =(Integer)i.next();
				display.accept(in);
			}
			
			Thread t=new Thread();
			t.run();	
		}
	}
