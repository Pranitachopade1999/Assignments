package com.generics;

import java.util.HashSet;
import java.util.Iterator;

public class Employee_Hashset {

public static void main(String args[])
{
	HashSet<Employee> hset=new HashSet<>();
	hset.add(new Employee(101,"Pranita",20000,"Java Full Stack") );
	hset.add(new Employee(102,"Khushi",15000,"Web") );
	hset.add(new Employee(103,"Rani",25000,"C++ Developer") );
	hset.add(new Employee(101,"Pranita",20000,"Java Full Stack") );//duplicate not print
	hset.add(new Employee(104,"Pranita",20000,"Java Full Stack") );//duplicate not print
	Iterator<Employee> i=hset.iterator();
	while(i.hasNext())
	{
		Employee e=i.next();
		System.out.println(e);
		
	}
	
	
}
}

class Employee
{
	int id;
	String name;
	double salary;
	String department;
	public Employee(int id, String name, double salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public String toString()
	{
		return id+", "+name+", "+department+", "+salary;
	}
	

}
