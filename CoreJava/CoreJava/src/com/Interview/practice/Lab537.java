package com.Interview.practice;

public class Lab537 {
public static void main(String[] args) {
	System.out.println(Myabstract.a);
	Myabstract.show();
}
}
abstract class Myabstract{
	static int a=1234;
	static void show(){
		System.out.println("Hello -> show()");
	}
	abstract int mm2();
}