package com.Interview.practice;

public class Lab545 {
public static void main(String[] args) {
Inter1 ref=new Haai();
//ref.m1();  ref.m2();
//new Haai().m3();
Haai hai=(Haai) ref;
hai.m1(); hai.m2(); hai.m3(); 
}
}

interface Inter1{
	String m1();
	public abstract void m2();
	int a=10;
	public final int b=20;

}
abstract class Heello implements Inter1{
	public String m1(){
		System.out.println("Hello-m1() :" +a);
		return "yuuhh";
	}
}
class Haai extends Heello{
	public void m2(){
		System.out.println("Hai -> m2() :" +b);
	}
	void m3(){
		System.out.println("Hai -> m3()");
	}
}