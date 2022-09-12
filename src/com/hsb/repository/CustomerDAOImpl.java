package com.hsb.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hsb.model.Customer;
import com.hsb.util.DbUtil;

public class CustomerDAOImpl implements CustomerDAO {
	private static Connection con;

	static {
		con = DbUtil.connection();
	}

	@Override
	public void addCustomer(Customer customer) throws SQLException {

		PreparedStatement ps = con.prepareStatement("INSERT INTO customer VALUES(?,?,?,?)");
		ps.setString(1, customer.getCustId());
		ps.setString(2, customer.getName());
		ps.setString(3, customer.getAddress());
		ps.setLong(4, customer.getMobile());

		ps.executeUpdate();
		con.close();

	}

	@Override
	public List<Customer> showCustomers() throws SQLException {
		List<Customer> customers = new ArrayList<>();
		Statement statement = con.createStatement();

		ResultSet resultSet = statement.executeQuery("SELECT *FROM customer");

		while (resultSet.next()) {
			String custId = resultSet.getString(1);
			String name = resultSet.getString(2);
			String address = resultSet.getString(3);
			long mob = resultSet.getLong(4);

			Customer c = new Customer(custId, name, address, mob);
			customers.add(c);
		}

		return customers;
	}
}
