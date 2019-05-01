package yuva.Practice.CoreJava;

public class P6 {
public static void main(String[] args) {
	C c=new C();
}
}
class A{
	A(){
		System.out.println("A()");
	}
}
class B extends A{
	B(){
		System.out.println("B()");
	}
}
class C extends B{
	C(){
		System.out.println("C()");
	}
}