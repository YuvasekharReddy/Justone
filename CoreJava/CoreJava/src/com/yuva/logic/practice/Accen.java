package com.yuva.logic.practice;

public class Accen {
public static void main(String[] args) {
	J j=new J();
	int f=j.m1(15);
	System.out.println(f);
}
}
class J{
	 int m1(int a){
		System.out.println("one arg construct");
		return 12;
	}

	public double m1(String s,int b){
		System.out.println("two arg construct");
		return 14.0;
	}
	public float m1(String d,String a){
		System.out.println("two arg string constructor");
		return 23.2f;
	}
}

/*class K extends J{
	public float m1(int a){
		
		return 10.0f;
	}
}*/