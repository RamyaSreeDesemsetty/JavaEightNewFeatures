package com.defaultandstaticmethods;

interface Vehicles {
	void speed();

	static String companyName() {
		return "BMW";
	}
}

class CarNew implements Vehicles {

	@Override
	public void speed() {
		System.out.println("speed up");

	}

}
public class StaticDemo {

	public static void main(String[] args) {
		Vehicles ve = new CarNew();
		System.out.println(Vehicles.companyName());

	}

}
