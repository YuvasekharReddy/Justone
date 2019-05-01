package com.jlcindia.hibernate;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab24A {

	public static void main(String[] args) {
		Transaction tx=null;
		try{
			SessionFactory sf=CHibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			List<String> qualis=new ArrayList<String>();
			qualis.add("M.Sc");
			qualis.add("M.C.A");
			qualis.add("M.Tech");
			Set<String> exps=new HashSet<>();
			exps.add("SUN");
			exps.add("IBM");
			exps.add("ORACLE");
			Author a1=new Author("sri","sri@jlc",124,new Date(),qualis,exps);
			Author a2=new Author("vas","vas@jlc",321,new Date(),qualis,exps);
			session.save(a2);
			Book b1=new Book("Master java",99.99,1,"jlc");
			session.save(b1);
			Book b2=new Book("Master Hib",99.99,1,"jlc");
			session.save(b2);
			Book b3=new Book("Master Spring",99.99,1,"jlc");
			session.save(b3);
			
			Set<Author> as1=new HashSet<Author>();
			as1.add(a1);
			Set<Author> as2=new HashSet<Author>();
			as2.add(a2);
			b1.setAuthors(as1);
			b2.setAuthors(as2);
			b3.setAuthors(as2);
			tx.commit();
			session.close();
			System.out.println("Record Inserted");
		}catch(Exception e){
			if(tx!=null)
				tx.rollback();
		}

	}

}
