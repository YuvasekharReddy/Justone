package com.jlcindia.hibernate;

import java.util.List;

import com.jlcindia.hibernate.Customer;

public interface CustomerDAO {

	public Customer getCustomersByEmail(String email);
	public Customer getCustomersByCname(String cname);
	public int addCustomer(Customer cust);
	public void updateCustomer(Customer cust);
	public void deleteCustomer(int cid);
	public List<Customer> getAllCustomers();
	public List<Customer> getAllCustomers(int start,int total);
}
