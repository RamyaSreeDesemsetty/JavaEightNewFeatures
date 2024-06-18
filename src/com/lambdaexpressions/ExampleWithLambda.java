package com.lambdaexpressions;

interface ShapeNew {
	public void draw();
}
public class ExampleWithLambda {

	public static void main(String[] args) {
		ShapeNew rectangle = () -> System.out.println("Rectangle Method");
		rectangle.draw();

		ShapeNew circle = () -> System.out.println("Circle Method");
		circle.draw();
	}

}
