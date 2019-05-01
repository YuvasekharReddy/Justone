package yuva.Practice.CoreJava;

public class P12 {
public static void main(String[] args) {
	Ha h=new Ha(10);
	h.show();
}
}
abstract class Hel{
	int a;
	Hel(int a){
		this.a=a;
		System.out.println("Hello(int)Cons");
	}
	{
		System.out.println("Hello->I.B");
	}
	void show(){
		System.out.println("Hello->show()");
	}
}
class Ha extends Hel{
	Ha(int a){
		super(a);
	}
}