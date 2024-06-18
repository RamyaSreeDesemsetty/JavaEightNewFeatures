package com.defaultandstaticmethods;

interface Vehicle {
	void speed();

	default String m1() {
		return "m1";
	}

	default String m2() {
		return "m2";
	}
}

class Car implements Vehicle {

	@Override
	public void speed() {
		System.out.println("speed up");

	}

}
public class DefaultDemo {

	public static void main(String[] args) {
		Vehicle veh = new Car();
		veh.speed();
		System.out.println(veh.m1());
		System.out.println(veh.m2());

	}

}
