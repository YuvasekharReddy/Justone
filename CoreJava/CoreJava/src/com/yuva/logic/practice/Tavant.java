package com.yuva.logic.practice;

public class Tavant {
	public static void main(String[] args) {
		M m=new M();
		m.m1("yuva");
		N n=new N();
		n.m1("kdhk");
		M m2=new N();
		m2.m1("fkhjh");
		
		
	}

}
class M{
	void m1(String s){
		System.out.println("Yuva");
	}
}
class N extends M{
	void m1(String s){
		System.out.println("raj");
	}
}