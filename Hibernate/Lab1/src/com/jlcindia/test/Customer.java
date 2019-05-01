package com.jlcindia.test;

public class Customer {
private int cid;
private String cname;
private String email;
private long phone;
private String city;
private String cardType;
private int cardNo;
private String status;
private double bal;

public String getCardType() {
	return cardType;
}

public void setCardType(String cardType) {
	this.cardType = cardType;
}

public int getCardNo() {
	return cardNo;
}

public void setCardNo(int cardNo) {
	this.cardNo = cardNo;
}

public String getStatus() {
	return status;
}

public void setStatus(String status) {
	this.status = status;
}

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

public Customer(String cname,String email,long phone,String city,String cardType,int cardNo,String status,double bal) {
	System.out.println("customer arguments constructor()");
	this.cname=cname;
	this.email=email;
	this.phone=phone;
	this.city=city;
	this.bal=bal;
	this.cardType=cardType;
	this.cardNo=cardNo;
	this.status=status;
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
	return this.cid+"\t"+this.cname+"\t"+this.email+"\t"+this.city+"\t"+this.bal+"\t"+this.cardNo+"\t"+this.cardType+"\t"+this.status;

}

}
