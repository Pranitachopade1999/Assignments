package com.generics;

import java.util.HashMap;

public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,Double>map=new HashMap<>();
		
		map.put(101,200.0);
		map.put(102,200.0);
		map.put(103,200.5);
		map.put(103,210.25);
		map.put(104,234.0);
		
		for(Integer i:map.keySet())
		{
			System.out.println("Key : "+ i + " Value : " +map.get(i));
		}
	}

}
