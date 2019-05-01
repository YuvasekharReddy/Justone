package com.yuva.logic.practice;

@FunctionalInterface
interface MN{
	void t1();
}

public class Test4{

	public static void main(String[] args) {
		
		MN m=()->{
			int a=10;
			System.out.println("HI HI HI "+a);
		};			
		m.t1();
	}
}
