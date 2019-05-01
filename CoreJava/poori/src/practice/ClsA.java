package practice;

public class ClsA {
	public static void main(String[] args) {
		ClsB b=new ClsB();
		C c=new C();
		System.out.println(b.name);
		System.out.println(c.name);
		c=(C)b;
		System.out.println(b.name);
				
	}
}

class ClsB{
	String name="yuva";
}

class C extends ClsB{
	String name="Reddy";
}