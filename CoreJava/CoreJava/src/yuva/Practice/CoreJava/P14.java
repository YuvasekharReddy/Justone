package yuva.Practice.CoreJava;

public class P14 {
	public static void main(String[] args) {
		Inter1 ref=new How();
		ref.m1();
		ref.m2();
		//ref.m3();
	}

}
interface Inter1{
	void m1();
	void m2();
	int a=10;
	int b=20;
}

abstract class HHello implements Inter1{
	public void m1(){
		System.out.println("Hello->M1():"+a);
	}
}

abstract class HHai extends HHello{
}
	
class How extends HHello{
	 public void m2(){
		 System.out.println("Hai->m2():"+b);
	  m3();
}
	 protected void m3(){
		 System.out.println("HOW M3()");
	 }
}
	 
	
