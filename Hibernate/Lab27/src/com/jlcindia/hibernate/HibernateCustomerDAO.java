package com.jlcindia.hibernate;

import java.util.List;

import com.jlcindia.hibernate.Customer;

public class HibernateCustomerDAO implements CustomerDAO{

	@Override
	public Customer getCustomersByEmail(String email) {
		String hql="from Customer c where c.email=?";
		Customer c=(Customer)HibernateTemplate.findObject(hql,email);
		return c;
	}

	@Override
	public Customer getCustomersByCname(String cname) {
		String hql="from Customer c where c.cname=?";
		Customer c=(Customer)HibernateTemplate.findObject(hql,cname);
		return c;
	}

	@Override
	public int addCustomer(Customer cust) {
		Integer it=(Integer)HibernateTemplate.save(cust);
				return it.intValue();
	}

	@Override
	public void updateCustomer(Customer cust) {
		HibernateTemplate.update(cust);
		
	}

	@Override
	public void deleteCustomer(int cid) {
		HibernateTemplate.delete(Customer.class, cid);
		
	}

	@Override
	public List<Customer> getAllCustomers(int start,int total) {
		String hql="from Customer c";
		List<Customer> list=HibernateTemplate.findList(hql, start, total);
		return list;
	}

	@Override
	public List<Customer> getAllCustomers() {
		String hql="from Customer c";
		List<Customer> list=HibernateTemplate.getlist(hql);
		return list;
	}

	
}
