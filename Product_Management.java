package com.tka.june29;

import java.util.ArrayList;
import java.util.Scanner;

public class Product_Management {
	public static void main(String[] args) {

		ArrayList<Product> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		int choice;

		do {

			System.out.println("\n--PRODUCT INVENTORY SYSTEM--");
			System.out.println("1.Add Product");
			System.out.println("2.Display Inventory");
			System.out.println("3.Search Product By ID");
			System.out.println("4.Update Quantity");
			System.out.println("5.Find Most Expensive Product");
			System.out.println("6.Calculate Total Inventory Value");
			System.out.println("7.Exit");
			System.out.print("Enter Choice : ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:

				System.out.print("Enter Product ID : ");
				int id = sc.nextInt();

				sc.nextLine();

				System.out.print("Enter Product Name : ");
				String name = sc.nextLine();

				System.out.print("Enter Product Price : ");
				int price = sc.nextInt();

				System.out.print("Enter Product Quantity : ");
				int quantity = sc.nextInt();

				sc.nextLine();

				System.out.print("Enter Product Category : ");
				String category = sc.nextLine();

				list.add(new Product(id, name, price, quantity, category));

				System.out.println("Product Added Successfully.");
				break;

			case 2:

				if (list.isEmpty()) {
					System.out.println("Inventory is Empty.");
				} else {

					for (Product p : list) {

						System.out.println("\n-");
						System.out.println("ID : " + p.getid());
						System.out.println("Name : " + p.getname());
						System.out.println("Price : " + p.getprice());
						System.out.println("Quantity : " + p.getquantity());
						System.out.println("Category : " + p.getcategory());
					}
				}
				break;

			case 3:

				System.out.print("Enter Product ID : ");
				int searchId = sc.nextInt();

				boolean found = false;

				for (Product p : list) {

					if (p.getid() == searchId) {

						System.out.println("Product Found");
						System.out.println("ID : " + p.getid());
						System.out.println("Name : " + p.getname());
						System.out.println("Price : " + p.getprice());
						System.out.println("Quantity : " + p.getquantity());
						System.out.println("Category : " + p.getcategory());

						found = true;
						break;
					}
				}

				if (!found) {
					System.out.println("Product Not Found.");
				}

				break;

			case 4:

				System.out.print("Enter Product ID : ");
				int updateId = sc.nextInt();

				boolean updated = false;

				for (Product p : list) {

					if (p.getid() == updateId) {

						System.out.print("Enter New Quantity : ");
						int q = sc.nextInt();

						p.setquantity(q);

						System.out.println("Quantity Updated Successfully.");
						updated = true;
						break;
					}
				}

				if (!updated) {
					System.out.println("Product Not Found.");
				}

				break;

			case 5:

				if (list.isEmpty()) {

					System.out.println("Inventory is Empty.");

				} else {

					Product max = list.get(0);

					for (Product p : list) {

						if (p.getprice() > max.getprice()) {

							max = p;
						}
					}

					System.out.println("Most Expensive Product");
					System.out.println("ID : " + max.getid());
					System.out.println("Name : " + max.getname());
					System.out.println("Price : " + max.getprice());
					System.out.println("Quantity : " + max.getquantity());
					System.out.println("Category : " + max.getcategory());

				}

				break;

			case 6:

				int total = 0;

				for (Product p : list) {

					total = total + (p.getprice() * p.getquantity());

				}

				System.out.println("Total Inventory Value = " + total);

				break;

			case 7:

				System.out.println("Thank You");
				break;

			default:

				System.out.println("Invalid Choice");

			}

		} while (choice != 7);

	

}
}
