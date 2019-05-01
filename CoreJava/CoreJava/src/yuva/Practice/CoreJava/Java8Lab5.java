package yuva.Practice.CoreJava;

public class Java8Lab5 {

	public static void main(String[] args) {
		
		Hello15 h=new Hello15();
		System.out.println(h.getNumber());
		
	}

}

interface Inter3{
	default Number getNumber() {
		System.out.println("getNumber in Inter3");
		return 42;
	}
}
interface Inter4 extends Inter3{}

interface Inter5 extends Inter3{}

class Hello15 implements Inter4,Inter5{}


