package com.hsb.view;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.hsb.model.Customer;
import com.hsb.service.CustomerService;
import com.hsb.service.CustomerServiceImpl;

public class MainCLI {
	public static void main(String[] args) throws SQLException {
		System.out.println("----- Welcome to Hotel Booking -----");
		System.out.println("[1] Register/Add A New Customer");
		System.out.println("[2] Display All Cutomers");

		CustomerService service = new CustomerServiceImpl();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Choice >>>");

		int input = scanner.nextInt();

		switch (input) {
		case 1:
			service.createCustomer();
			break;
		case 2:
			List<Customer> customers = service.displayCustomers();
			customers.forEach(System.out::println);
			break;
		default:
			break;
		}
	}
}
