package com.lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class StringOperation {

		public static void main(String[] args) 
		{
			Map<Integer,String> m=new HashMap<>();
			m.put(1,"Pranita");
			m.put(2,"Khushi");
			m.put(3,"Radha");
			m.put(4,"Rani");
			

			StringBuilder sb = new StringBuilder();
			
	        Consumer<StringBuilder> c = result-> result.append(m.entrySet());
	        m.forEach((a,b)->sb.append(a).append(b));
	        System.out.println(sb.toString());
	      
		}
	}
