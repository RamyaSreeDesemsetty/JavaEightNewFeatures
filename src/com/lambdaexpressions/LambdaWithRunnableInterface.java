package com.lambdaexpressions;

class ThreadDemo implements Runnable {
//method1
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("running with");
	}

}
public class LambdaWithRunnableInterface {

	public static void main(String[] args) {
//method1
		ThreadDemo td = new ThreadDemo();
		Thread t = new Thread(td);
		t.start();
//method2 with lambda
		Runnable runnable = () -> System.out.println("running with lambda");
		// Directly running the runnable on the main thread
		runnable.run();

		// Running the runnable in a new thread
		Thread tdl = new Thread(runnable);
		t.start();

		// method3 with lambdaexpression is passesd to constructor
		Thread tlde = new Thread(() -> System.out.println("running with lambda"));
		tlde.start();
	}

}
