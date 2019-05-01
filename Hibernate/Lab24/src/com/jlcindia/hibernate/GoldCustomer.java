package com.jlcindia.hibernate;

import java.util.Map;
import java.util.Set;

import javax.persistence.*;

import org.hibernate.annotations.CollectionOfElements;

@Entity
@Table(name="gcustomer")
@PrimaryKeyJoinColumn(name="cid")
public class GoldCustomer extends Customer {
	
	@Column(name="ophone")
	 private long ophone;
	
	@CollectionOfElements
	@JoinTable(name="refs",joinColumns=@JoinColumn(name="cid"))
	@Column(name="remail")
	private Map<String,String> refs;
	
	
	@Column(name="points")
	private int points;


	public GoldCustomer() {
		super();
	}


	public long getOphone() {
		return ophone;
	}


	public void setOphone(long ophone) {
		this.ophone = ophone;
	}


	public Map<String, String> getRefs() {
		return refs;
	}


	public void setRefs(Map<String, String> refs) {
		this.refs = refs;
	}


	public int getPoints() {
		return points;
	}


	public void setPoints(int points) {
		this.points = points;
	}


	public GoldCustomer(int cid, String cname, String email, long phone,
			CreditCard ccard, Set<Order> orders, long ophone,
			Map<String, String> refs, int points) {
		super(cid, cname, email, phone, ccard, orders);
		this.ophone = ophone;
		this.refs = refs;
		this.points = points;
	}
	
	
	

}
