package com.collection;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Collection3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose between following options:");
		System.out.println("1.ID|2.Name|3.Department|4.Salary");
		int choose=sc.nextInt();
		
		TreeSet<Employee> emp=null;
		switch(choose)
		{
			case 1: emp=new TreeSet<>(new Id());
					break;
			case 2: emp=new TreeSet<>(new Name());
					break;
			case 3:	emp=new TreeSet<>(new Dept());
					break;
			case 4: emp=new TreeSet<>(new Sal());
					break;
			default:System.out.println("Invalid Option");
		}
		emp.add(new Employee(10,"Naruto","IT",2000));
		emp.add(new Employee(11,"Luffy","Management",2200));
		emp.add(new Employee(12,"Goku","HR",1800));
		emp.add(new Employee(13,"Madara","Management",1900));
		emp.add(new Employee(14,"Itachi","HR",2100));
		emp.add(new Employee(16,"Vegeta","Training",2400));
		emp.add(new Employee(15,"Karma","IT",2000));
		emp.add(new Employee(19,"Leleouch","IT",2300));
		emp.add(new Employee(17,"Minato","HR",1900));
		emp.add(new Employee(18,"Gohan","Management",1700));
		
		for(Employee e:emp)
		{
			System.out.println(e);
		}
	}

}

class Id implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getId()>e2.getId())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class Name implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		
		return e1.getName().compareTo(e2.getName());
	}
}
class Dept implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getDepartment().compareTo(e2.getDepartment());
	}
}
class Sal implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getSalary()>e2.getSalary())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
class Employee{
	
	int id;
	String name;
	String department;
	int salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Employee(int id, String name, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	
}