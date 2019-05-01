package com.jlcindia.hibernate;

import javax.persistence.*;

@Entity
@Table(name="scustomers")
public class SilverCustomer {

	@Column(name="city")
	private String city;
	
	@Column(name="rpoints")
	private int rpoints;
	
	@Column(name="oemail")
	private String oemail;

	public SilverCustomer() {
		super();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getRpoints() {
		return rpoints;
	}

	public void setRpoints(int rpoints) {
		this.rpoints = rpoints;
	}

	public String getOemail() {
		return oemail;
	}

	public void setOemail(String oemail) {
		this.oemail = oemail;
	}

	public SilverCustomer(String city, int rpoints, String oemail) {
		super();
		this.city = city;
		this.rpoints = rpoints;
		this.oemail = oemail;
	}
	
	
}
