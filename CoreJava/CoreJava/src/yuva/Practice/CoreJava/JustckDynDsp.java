package yuva.Practice.CoreJava;

public class JustckDynDsp {
	public static void main(String[] args) {
		Interr1 in=new HelloKLM();
		System.out.println(in.A);
		System.out.println(in.B);
	    in.g1();
	    in.g2();
	}
	
}


interface Interr1{
	void g1();
	public abstract void g2();
	int A=10;
	public final int B=20;
}
class HelloKLM implements Interr1{
	int A=16;
	int B=25;
	public void g1() {
		System.out.println("hello - > m1():"+A);
	}
	public void g2() {
		System.out.println("hello - > m2():"+B);
	}
}