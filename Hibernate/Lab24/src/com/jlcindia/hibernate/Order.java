package com.jlcindia.hibernate;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="orderId")
	private int orderId;
	
    @Column(name="totalQty")
    private int totalQty;
    
    @Column(name="totalCost")
    private Double totalCost;
    
    @Column(name="orderDate")
    private Date orderDate;
    
    @Column(name="status")
    private String status;
    
    @ManyToOne
    @JoinColumn(name="cid",referencedColumnName="cid")
    private Customer customer;
    
    @OneToOne
    @JoinColumn(name="addid")
    private ShippingAddress address;
    
    @OneToMany(mappedBy="order")
    private Set<OrderItem> orederItems;

	public Order() {
		super();
	}

	public Order(int orderId, int totalQty, Double totalCost, Date orderDate,
			String status, Customer customer, ShippingAddress address,
			Set<OrderItem> orederItems) {
		super();
		this.orderId = orderId;
		this.totalQty = totalQty;
		this.totalCost = totalCost;
		this.orderDate = orderDate;
		this.status = status;
		this.customer = customer;
		this.address = address;
		this.orederItems = orederItems;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getTotalQty() {
		return totalQty;
	}

	public void setTotalQty(int totalQty) {
		this.totalQty = totalQty;
	}

	public Double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ShippingAddress getAddress() {
		return address;
	}

	public void setAddress(ShippingAddress address) {
		this.address = address;
	}

	public Set<OrderItem> getOrederItems() {
		return orederItems;
	}

	public void setOrederItems(Set<OrderItem> orederItems) {
		this.orederItems = orederItems;
	}
    
    
}
