package yuva.Practice.CoreJava;

public class Java8Lab4 {

	public static void main(String[] args) {

		Hello44 h=new Hello44();
		System.out.println(h.getNumber());

	}

}

interface Inter0{
	default Number getNumber() {
		System.out.println("getNumber in Inter1");
		return 42;
	}
}

interface Inter2 extends Inter0{
	default Integer getNumber() {
		System.out.println("getNumber in Inter2");
		return 10;
	}
}

class Hello44 implements Inter0,Inter2{}

//class Hello44 implements Inter0{}
