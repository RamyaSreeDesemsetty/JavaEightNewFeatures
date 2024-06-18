package com.functionalinterface;

interface Shape {
	void draw();
}

public class FunctionalInterfaceWithLambda {
	public static void main(String[] args) {
		Shape rectangle = () -> System.out.println("Rectangle");
		rectangle.draw();
	}
}
