package com.generics;

import java.util.Date;

public class Generic_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pair<String,String> pair1=new Pair<>();
		pair1.setKey("1");
		pair1.setValue("Pranita");
		
		Pair<String,Date> pair2=new Pair<>();
		pair2.setKey("Today is ");
		pair2.setValue(new java.util.Date());
		
		pair1.print();
		pair2.print();
	}

}

class Pair<K,V>
{
	K key;
	V value;
	
	
	
	public K getKey() {
		return key;
	}



	public void setKey(K key) {
		this.key = key;
	}



	public V getValue() {
		return value;
	}



	public void setValue(V value) {
		this.value = value;
	}



	public void print()
	{
		System.out.println(key+ " " + value);
	}
	
	
}
