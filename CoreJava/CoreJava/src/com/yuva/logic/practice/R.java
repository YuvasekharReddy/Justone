package com.yuva.logic.practice;

class Keyfalcon {
int a,b,c;
Keyfalcon(int a,int b){
	this.a=a;
	this.b=b;
}
Keyfalcon(int a,int b,int c){
	this.a=a;
	this.b=b;
	this.c=c;
}
}
class Mi extends Keyfalcon{	

	public Mi() {
		super(1,2);
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(super.c);
	}
	public Mi(int d){
		super(3,4,5);
		System.out.println(super.a);
		System.out.println(super.b);
		System.out.println(super.c);
	}
}
public class R{
	public static void main(String[] args) {
		Mi u=new Mi();
		Mi u1=new Mi(4);
		
		
	}
}