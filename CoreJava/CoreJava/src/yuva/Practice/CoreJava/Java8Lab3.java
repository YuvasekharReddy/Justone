package yuva.Practice.CoreJava;

public class Java8Lab3 {
	public static void main(String[] args) {
		Hell h = new Hell();
		System.out.println(h.getNumber());
	}
}

interface Inter123 {
	default Number getNumber() {
		System.out.println("getNumber in Inter1");
		return 42;
	}
}

class A1 {
	public Integer getNumber() {
		System.out.println("getNumber in A");
		return 10;
	}
}

class Hell extends A1 implements Inter123 {

}