package com.yuva.logic.practice;

public class Lab610 {

public static void main(String[] args) throws CloneNotSupportedException {
 MyHai hai=new MyHai(10);
 MyHello h1=new MyHello(20,hai);
 MyHello h2=(MyHello)h1.clone();
 System.out.println(h1==h2);
 System.out.println(h1.hai==h2.hai);
 h1.show();
 h2.show();
 h2.y=11;
 h2.hai.x=22;
 System.out.println("after intializing y=11 and hai.x=22");
 h1.show();
 h2.show();

	}

}

class MyHai{
	int x;
	MyHai(int x){
		this.x=x;
	}
}

class MyHello implements Cloneable{
	int y;
	MyHai hai;
	MyHello(int y , MyHai hai){
		this.y=y;
		this.hai=hai;
	}
	void show() {
		System.out.println("Hello->Y :" +y);
		System.out.println("Hai -> X : " +hai.x);
	}
	public Object clone()throws CloneNotSupportedException{
		if(this instanceof Cloneable) {
			MyHai hai = new MyHai(this.hai.x);
			MyHello h=new MyHello(this.y,hai);
			return h;
		}else {
			throw new CloneNotSupportedException(getClass().getName());
		}
	}
}