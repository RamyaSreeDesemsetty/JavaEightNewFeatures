package com.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class StreamSorting {
	
		
	public static void main(String[] args) {

		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Grapes");
		fruits.add("Banana");
		
		
		System.out.println("========Asscenfing order========");
		List<String> newFruits = fruits.stream().sorted().collect(Collectors.toList());
		newFruits.forEach(System.out::println);
		
		List<String> newFruit = fruits.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		newFruit.forEach(System.out::println);

		List<String> newFruitle = fruits.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());
		newFruitle.forEach(System.out::println);
		
		System.out.println("========descenning order========");
		List<String> newFruitRev = fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		newFruitRev.forEach(System.out::println);

		List<String> newFruitleRev = fruits.stream().sorted((o1, o2) -> o2.compareTo(o1)).collect(Collectors.toList());
		newFruitleRev.forEach(System.out::println);

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "Alice", 30, 50000));
		employeeList.add(new Employee(2, "Bob", 25, 45000));
		employeeList.add(new Employee(3, "Charlie", 35, 55000));
		employeeList.add(new Employee(4, "David", 28, 48000));
		employeeList.add(new Employee(5, "Eve", 40, 60000));

		List<Employee> emp = employeeList.stream().sorted(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return (int) (o1.getSalary() - o2.getSalary());
			}

		}).collect(Collectors.toList());
		System.out.println(emp);

		List<Employee> emple = employeeList.stream().sorted((o1, o2) -> (int) (o1.getSalary() - o1.getSalary()))
				.collect(Collectors.toList());
		System.out.println(emple);
		
		List<Employee> emples = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary))
				.collect(Collectors.toList());
		System.out.println(emples);
	}

	}


