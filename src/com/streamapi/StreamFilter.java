package com.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	private int id;
	private String name;
	private double price;

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
public class StreamFilter {
	private static List<Product> getProducts() {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1, "HP Laptop", 25000));
		productList.add(new Product(2, "Dell Laptop", 35000));
		productList.add(new Product(3, "Lenovo Laptop", 45000));
		productList.add(new Product(4, "Sony Laptop", 15000));
		productList.add(new Product(5, "Apple Laptop", 95000));
		return productList;

	}
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		for (Product prod : getProducts()) {
			if (prod.getPrice() > 25000) {
				list.add(prod);
	
		}
	}
//		System.out.println(list);
for(Product pr:list) {
	System.out.println(pr.getName());
	System.out.println(pr);

	}
	System.out.println("using streams\n");
	List<Product> pr = getProducts().stream().filter((s) -> s.getPrice() > 25000).collect(Collectors.toList());
	pr.forEach(System.out::println);
}
}
