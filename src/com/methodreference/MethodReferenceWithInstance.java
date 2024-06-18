package com.methodreference;

interface Printable {
	void print(String msg);

}
public class MethodReferenceWithInstance {
	public void display(String s) {
		System.out.println(s);
	}
	public static void main(String[] args) {
		MethodReferenceWithInstance obj = new MethodReferenceWithInstance();
		Printable printable = (s) -> obj.display(s);
		printable.print("Ramya");

		Printable printables = obj::display;
		printables.print("Ramya");
	}

}
