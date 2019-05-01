package com.jlcindia.hibernate;

import java.util.List;

import org.hibernate.*;

import com.jlcindia.hibernate.Customer;

public class Lab27 {
public static void main(String[] args) {
	CustomerDAO cdao=DAOFactory.getCustomerDAO();
	System.out.println("customer by email");
	Customer c=(Customer)cdao.getCustomersByEmail("yuva@gmail.com");
	System.out.println(c);
	System.out.println("customer by name");
	Customer c1=(Customer)cdao.getCustomersByCname("sekhar");
	System.out.println(c1);
	System.out.println("Add Customer");
	Customer cust= new Customer("Bahdjjk","b@gmail.com0",456622356,"Bangalore",45632);
	int c2=cdao.addCustomer(cust);
	System.out.println(c2);
	List<Customer> list=cdao.getAllCustomers();
	for(Customer cst:list){
		System.out.println(cst);
	}
}
} 