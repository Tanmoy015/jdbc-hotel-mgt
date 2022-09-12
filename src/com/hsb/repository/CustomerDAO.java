package com.hsb.repository;

import java.sql.SQLException;
import java.util.List;

import com.hsb.model.Customer;

public interface CustomerDAO {

	void addCustomer(Customer customer) throws SQLException;

	List<Customer> showCustomers() throws SQLException;

}
