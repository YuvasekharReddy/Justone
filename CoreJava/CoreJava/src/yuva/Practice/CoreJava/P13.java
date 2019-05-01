package yuva.Practice.CoreJava;

public class P13 {
public static void main(String[] args) {
	M m=new R();
	m.m1();
}
	
}

abstract class M{
	abstract void m1();
	//abstract void m2();
}
 abstract class Y extends M{
	 void m1(){
		 System.out.println("Y-m1()");
	 }
	 
 }
  class R extends Y{
	 /*void m2(){
		 System.out.println("R-m2()");
	 }*/
 }