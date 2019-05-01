package com.yuva.logic.practice;

interface Mcv{
  Number g(int a,int b);
}

public class Hcl1 implements Mcv{
public Float g(int a,int b){
	System.out.println("Hcl1");
	return 10.0f;
}
public static void main(String[] args) {
	Mcv m=new Hcl1();
	m.g(4, 5);
}
}
