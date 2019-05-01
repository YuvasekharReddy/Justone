package com.jlcindia.hibernate;

import javax.persistence.*;

@Entity
@Table(name="address")
public class ShippingAddress {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="addid")
	private int addid;
	
	@Column(name="street")
	private String street;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@OneToOne
	@JoinColumn(name="addid")
	private Order order;

	public ShippingAddress() {
		super();
	}

	public int getAddid() {
		return addid;
	}

	public void setAddid(int addid) {
		this.addid = addid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public ShippingAddress(int addid, String street, String city, String state,
			Order order) {
		super();
		this.addid = addid;
		this.street = street;
		this.city = city;
		this.state = state;
		this.order = order;
	}
	
	
	
	
}
