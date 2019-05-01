package com.yuva.logic.practice;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Excptn1 {
public static void main(String[] args)throws Exception {
	try{
		B3 b=new B3();
		b.m1();
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
class A3{
	void m1()throws Exception{
		System.out.println("Super Exception");
	}
}
class B3 extends A3{
	void m1()throws InstantiationException{
		System.out.println("Sub Type Exception");
	}
}
