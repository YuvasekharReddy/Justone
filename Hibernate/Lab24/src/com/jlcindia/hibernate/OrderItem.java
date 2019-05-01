package com.jlcindia.hibernate;

import javax.persistence.*;

@Entity
@Table(name="orderitems")
public class OrderItem {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="otid")
	private int otid;
	
	@Column(name="qty")
	private int qty;
	
	@Column(name="cost")
	private double cost;
	
	@ManyToOne
	@JoinColumn(name="orderid",referencedColumnName="orderId")
	private Order order;
	
	@OneToOne
	@JoinColumn(name="bid")
	private Book book;

	public OrderItem() {
		super();
	}

	public OrderItem(int otid, int qty, double cost, Order order, Book book) {
		super();
		this.otid = otid;
		this.qty = qty;
		this.cost = cost;
		this.order = order;
		this.book = book;
	}

	public int getOtid() {
		return otid;
	}

	public void setOtid(int otid) {
		this.otid = otid;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	
	
}
