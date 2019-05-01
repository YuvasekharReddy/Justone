package com.yuva.logic.practice;

public class MthdHdng {
public static void main(String[] args) {
	A a;
	B b;
	B.m1();
	A.m1();
}
}
class A{
	static void m1(){
		System.out.println("A-class");
	}
}
class B extends A{
	static void m1(){
		System.out.println("B-Class");
	}
}