package yuva.Practice.CoreJava;

public class java8Lab2 {

	public static void main(String[] args) {
		Hello001 h=new Hello001();
		h.show();
	}

}

interface Inter001{
	default void show() {
		System.out.println("\n** show() in Inter1**");
		
	}
}
class Hello001 implements Inter001{
	public void show() {
		System.out.println("** show() in Hello **");
		Inter001.super.show();
	}
}
