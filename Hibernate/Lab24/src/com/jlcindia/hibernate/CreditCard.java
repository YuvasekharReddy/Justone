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
@Table(name="ccards")
public class CreditCard {
	
	@Column(name="ccid")
	private int ccid;
	
	@Column(name="ccno")
	private int ccno;
	
	@Column(name="ctype")
	private String ctype;
	
	@Column(name="code")
	private int code;
	
	public CreditCard() {
		super();
	}

	public CreditCard(int ccid, int ccno, String ctype, int code, Date expDate,
			Customer customer) {
		super();
		this.ccid = ccid;
		this.ccno = ccno;
		this.ctype = ctype;
		this.code = code;
		this.expDate = expDate;
		this.customer = customer;
	}

	public int getCcid() {
		return ccid;
	}

	public void setCcid(int ccid) {
		this.ccid = ccid;
	}

	public int getCcno() {
		return ccno;
	}

	public void setCcno(int ccno) {
		this.ccno = ccno;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Date getExpDate() {
		return expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Column(name="expdate")
	private Date expDate;
	
	@OneToOne
	@JoinColumn(name="ccid")
    private Customer customer;
	  
	
	
}
