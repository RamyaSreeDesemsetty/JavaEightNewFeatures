package com.lambdaexpressions;

public class LambdaExpressionAsAMethodParameter {

	public static void main(String[] args) {
		/*
		 * ShapeNew rectangle = () -> System.out.println("Rectangle Method"); //
		 * rectangle.draw();
		 * 
		 * ShapeNew circle = () -> System.out.println("Circle Method"); //
		 * circle.draw(); print(rectangle); print(circle);
		 */
		print(() -> System.out.println("Rectangle Method"));
		print(() -> System.out.println("Circle Method"));
	}

	private static void print(ShapeNew shape) {
		shape.draw();
	}

}
