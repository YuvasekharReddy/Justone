package com.jlcindia.hibernate;

public class Customer {
private int cid;
private String cname;
private String email;
private long phone;
private String city;
private double bal;

public Customer(){
	System.out.println("Customer Default constructor()");
}

/*public Customer(String cname,String email,long phone,String city,double bal){
	this.cname=cname;
	this.email=email;
	this.phone=phone;
	this.city=city;
	this.bal=bal;
}*/

public Customer(String cname2, String email2, long phone2, String city2,
		double bal2) {
	System.out.println("customer arguments constructor()");
	this.cname=cname2;
	this.email=email2;
	this.phone=phone2;
	this.city=city2;
	this.bal=bal2;
}

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

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public double getBal() {
	return bal;
}

public void setBal(double bal) {
	this.bal = bal;
}
public String toString(){
	return this.cid+"\t"+this.cname+"\t"+this.email+"\t"+this.city+"\t"+this.bal;

}

}
