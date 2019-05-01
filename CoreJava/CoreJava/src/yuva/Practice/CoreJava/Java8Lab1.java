package yuva.Practice.CoreJava;

public class Java8Lab1 {

	public static void main(String[] args) {
		Hello01 h= new Hello01();
		h.process();
		h.show();

	}

}

interface Inter01{
	default void process() {
		System.out.println("\n**process in Inter01");
	}
	default void show() {
		System.out.println("\n** show() in Inter01");
	}
}

class Hello01 implements Inter01{
	public void process() {
		System.out.println("**process() in Hello**");
	}
}
