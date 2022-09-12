package com.hsb.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.hsb.model.Customer;
import com.hsb.repository.CustomerDAO;
import com.hsb.repository.CustomerDAOImpl;

public class CustomerServiceImpl implements CustomerService {
	private Scanner scanner = new Scanner(System.in);
	private CustomerDAO customerDAO = new CustomerDAOImpl();

	@Override
	public void createCustomer() throws SQLException {
		System.out.println("Enter Customer Name >>>");
		String name = scanner.next();

		System.out.println("Enter Customer Address >>>");
		String adr = scanner.next();

		System.out.println("Enter Customer Mobile >>>");
		long mob = scanner.nextLong();

		Customer c = new Customer(name, adr, mob);
		customerDAO.addCustomer(c);
	}

	@Override
	public List<Customer> displayCustomers() throws SQLException {
		return customerDAO.showCustomers();
	}

}
