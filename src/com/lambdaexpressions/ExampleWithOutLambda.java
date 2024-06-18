package com.lambdaexpressions;

interface Shape {
	public void draw();
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle Draw Method");

	}
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle Draw Method");

	}
}
public class ExampleWithOutLambda {
	public static void main(String[] args) {

		Shape r = new Rectangle();
		r.draw();
		Shape c = new Circle();
		c.draw();

}
}
