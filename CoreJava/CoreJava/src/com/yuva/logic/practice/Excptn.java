package com.yuva.logic.practice;

import java.io.IOException;

public class Excptn {
	public static void main(String[] args) {
		try{
			A2 a=new A2();
			a.m1();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

class A2{
	void m1()throws Exception{
		System.out.println("super Exception");
	}
	void m2()throws IOException{
		System.out.println("sub Exception");
	}
}