/**
 * 
 */
package com.jlcindia.hibernate;

import java.util.*;

import javax.persistence.*;


/**
 * @author YuvaSekhar
 *
 */
@Entity
@Table(name="customers")
@Inheritance(strategy=InheritanceType.JOINED)
public class Customer {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cid")
	private int cid;
	
	@Column(name="cname")
	private String cname;
	 
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private long phone;
	
	@OneToOne
    @JoinColumn(name="ccid")
	private CreditCard ccard;
	
	@OneToMany(mappedBy="customer")
	private Set<Order> orders;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public CreditCard getCcard() {
		return ccard;
	}

	public void setCcard(CreditCard ccard) {
		this.ccard = ccard;
	}

	public Set<Order> getOrders() {
		return orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	public Customer(int cid, String cname, String email, long phone,
			CreditCard ccard, Set<Order> orders) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.ccard = ccard;
		this.orders = orders;
	}

	public Customer() {
		super();
	}
	
	
	
}
