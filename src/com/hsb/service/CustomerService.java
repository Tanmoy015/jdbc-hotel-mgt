package com.hsb.service;

import java.sql.SQLException;
import java.util.List;

import com.hsb.model.Customer;

public interface CustomerService {

	void createCustomer() throws SQLException;

	List<Customer> displayCustomers() throws SQLException;
}
