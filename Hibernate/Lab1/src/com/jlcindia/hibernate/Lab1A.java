package com.jlcindia.hibernate;

import org.hibernate.*;

public class Lab1A {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf=CHibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		tx=session.beginTransaction();
		Customer cust=new Customer("yuvaraj","yuraj@gmail.com",125633L,"bloer",65000.00);
		session.save(cust);
		tx.commit();
		session.close();
		System.out.println("record Inserted");
	}catch(Exception e){
		e.printStackTrace();
		if(tx!=null)
			tx.rollback();
	}
}
} 