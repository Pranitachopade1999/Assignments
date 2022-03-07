package com.oops_assignment;

public class Polymorphism {

	public static void main(String[] args) {
		
		Manager m=new Manager("Pranita",20000, 4000);
		System.out.println("Salary of Manager is:" +m.Salary());
		
		Labor l=new Labor("Pranav",15000, 1500);
		System.out.println("Salary of Labor is:" +l.Salary());
	}

}
class Employee
{
	String name;
	double salary;
	Employee(String name ,double salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public double Salary()
	{
		return salary;
	}
}

class Manager extends Employee
{
  double incentive;
	Manager(String name, double salary,double incentive) {
		super(name, salary);
		this.incentive=incentive;
		
	}
	public double Salary()
	{
		return (salary+incentive);
	}
	
}

class Labor extends Employee
{
   double overtime;
	Labor(String name, double salary,double overtime) {
		super(name, salary);
		this.overtime=overtime;
		// TODO Auto-generated constructor stub
	}
	public double Salary()
	{
		return (salary+overtime);
	}
	
}
