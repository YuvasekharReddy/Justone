package com.yuva.logic.practice;

public class Fnl {
public static void main(String[] args) {
	F f=new F();
	f.m1(10,20);
}
}
class F{
	final  void m1(int a){
		System.out.println("one arg ");
	}
	final void m1(int a,int b){
		System.out.println("two arg");
	}
}