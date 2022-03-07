package com.collection;

import java.util.HashSet;
import java.util.Iterator;

public class Collection2 {
	   public static void main(String args[]) {
	      
	      HashSet<String> hset = new HashSet<String>();

	     
	      hset.add("Pranita");
	      hset.add("Khushi");
	      hset.add("Radha");
	      hset.add("Pranita");
	      hset.add("Pranav");
	      hset.add("Khushi");
	      hset.add("Ram");
	      hset.add("Sham");
	      hset.add("Pooja");
	      hset.add("Tulsi");
	      hset.add("Geeta");
	      hset.add("Gayatri");
	      
	      Iterator itr=hset.iterator();
	      while(itr.hasNext())
	      {
	    	  String result=(String)itr.next();
	    	  System.out.println(result);  
	      }
	      
	    }
	}
