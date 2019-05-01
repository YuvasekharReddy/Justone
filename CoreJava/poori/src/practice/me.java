package practice;

public class me {

	public static void main(String[] args) {
		A aobj=new B();
		aobj.m1();
		aobj.x=15;
		System.out.println(aobj.x);
		
		
	}

}
class A{
	int x=10;
  A(){
	  System.out.println("A-DC");
  }
 void m1(){
	System.out.println("A=method");
}	
}
class B extends A{
	int x=20;
	B(){
		System.out.println("B-DC");
	}
	B(int b){
		System.out.println("B-constructor");
	}
	
void m1(){
System.out.println("B=method");
}	
	
}