package com.Interview.practice;

public class MyMethodTest {
public static void main(String[] args) {
	Hai mmt=new Hai();
		   byte b=20;
		   mmt.m1(10);
}
}
class Hello{
 final void m1(byte a,int b){
	System.out.println("m1 first");
	
}
 final void m1(int a,byte b){
	System.out.println("m1 second");
	//return "lfkdk";
}
}
class Hai extends Hello{
	void m1(int a){
		System.out.println("sub class");
	}
}
