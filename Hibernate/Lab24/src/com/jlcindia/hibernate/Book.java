package com.jlcindia.hibernate;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {

	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="bid")
	private int bid;
	
	@Column(name="bname")
	private String bname;
	
	@Column(name="cost")
	private double cost;
	
	@Column(name="edition")
	private int edition;
	
	@Column(name="pub")
	private String pub;
	
	@ManyToMany(mappedBy="books")
	private Set<Author>authors;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) {
		this.edition = edition;
	}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	public Set<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Set<Author> authors) {
		this.authors = authors;
	}

	public Book(String bname, double cost, int edition, String pub) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.cost = cost;
		this.edition = edition;
		this.pub = pub;
		this.authors = authors;
	}

	public Book() {
		super();
	}
	
	
	
}
