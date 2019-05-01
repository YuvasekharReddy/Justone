package yuva.Practice.CoreJava;

public class Java8Lab6 {

	public static void main(String[] args) {
		Hello6 h=new Hello6();
		System.out.println(h.getNumber());
	}
}

interface Inter6{
	default Number getNumber() {
		System.out.println("getNumber in Inter1");
		return 42;
	}
}

interface Inter7{
	default Integer getNumber() {
		System.out.println("getNumber in inter2");
		return 10;
	}
}

class ABC implements Inter6{}

class BCD implements Inter7{}

//class CDE implements Inter6,Inter7{}

class Hello6 implements Inter6,Inter7{
	public Integer getNumber() {
		System.out.println(Inter6.super.getNumber());
		System.out.println(Inter7.super.getNumber());
		return 23;
	}
}
