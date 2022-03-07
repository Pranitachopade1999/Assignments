package com.oops_assignment;

public class Abstract_Shape_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Shapes l=new Line();
		l.draw();
		Shapes r=new Rectangle();
		r.draw();
		Shapes c=new Cub();
		c.draw();
		
	}

}

abstract class Shapes
{
	
	abstract void draw();
}

class Line extends Shapes
{

	@Override
	void draw() {
		System.out.println("Drawing Line....");
		
	}
	
}

class Rectangle extends Shapes
{

	@Override
	void draw() {
		System.out.println("Drawing Rectangle....");
		
	}
	
}

class Cub extends Shapes
{

	@Override
	void draw() {
		System.out.println("Drawing Cub....");
		
	}
	
}
