package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab1B {
public static void main(String[] args) {
	Transaction tx=null;
	try{
		SessionFactory sf=CHibernateUtil.getSessionFactory();
		//String sql="update customer set cid=8 where cname=raj"
		Session session=sf.openSession();
		tx=session.beginTransaction();
		Customer cust=(Customer)session.load(Customer.class, 4);
		System.out.println(cust.getCid()+"\t"+cust.getCname()+"\t"+cust.getEmail()+"\t"+cust.getPhone()+"\t"+cust.getCity()+"\t"+cust.getBal());
        tx.commit();
        session.close();
	}catch(Exception e){
	e.printStackTrace();
	if(tx!=null)tx.rollback();
}
	/*try{
		SessionFactory sf=CHibernateUtil.getSessionFactory();
		String sql="select * from customer c where c.cname=rajesh";
		Session session=sf.openSession();
		tx=session.beginTransaction();
		
		Customer cust=(Customer)session.load(sql, sql);
		System.out.println(cust.getCid()+"\t"+cust.getCname()+"\t"+cust.getEmail()+"\t"+cust.getPhone()+"\t"+cust.getCity()+"\t"+cust.getBal());
        tx.commit();
        session.close();
	}catch(Exception e){
	e.printStackTrace();
	if(tx!=null)tx.rollback();
}*/
}
}
