package com.yuva.logic.practice;

public class MarlbExcptn {
public static void main(String[] args) {
	My m=new My();
	try{
		m.m1();
		System.out.println("A");
	}catch(RuntimeException e){
		System.out.println("B");
	}catch(Exception e){
		System.out.println("c");
	}
	finally{
		System.out.println("D");
	}
	System.out.println("E");
}
}
 class My{
	void m1() throws Exception{
		 
		throw new Exception();
	 }
 }