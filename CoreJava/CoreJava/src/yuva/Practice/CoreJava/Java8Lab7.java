package yuva.Practice.CoreJava;

public class Java8Lab7 {

	public static void main(String[] args) {
		//Hello7.show();   //INVALID
		//Inter8 in=null;
		//in.show();       //INVALID
		//Inter8 in1=new Hello();
		//in1.show();      //INVALID
          Inter8.show();
	}

}

interface Inter8{
	static void show() {
		System.out.println("show in Inter8");
	}
}
interface Inter9{
	static void show() {
		System.out.println("show in Inter9");
	}
	default void process() {
		System.out.println("process in Inter9");
		show();
	}
}
class Hello7 implements Inter8{
	
}
class Hello8 implements Inter9{
	static void display() {
		//show();    //Error Create Method
		Inter9.show();
	}
	public void process() {
		//show();    //Error Create Method
		Inter9.show();
	}
	
}