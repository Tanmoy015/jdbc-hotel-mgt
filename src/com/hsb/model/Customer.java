package com.hsb.model;

public class Customer {
	private String custId;
	private String name;
	private String address;
	private Long mobile;
	private static int count;

	{
		custId = "C" + ++count;
	}

	public Customer(String name, String address, Long mobile) {
		super();
		this.name = name;
		this.address = address;
		this.mobile = mobile;
	}

	public Customer(String custId, String name, String address, long mob) {
		this.custId = custId;
		this.name = name;
		this.address = address;
		this.mobile = mob;
	}

	public String getCustId() {
		return custId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", name=" + name + ", address=" + address + ", mobile=" + mobile + "]";
	}

}
