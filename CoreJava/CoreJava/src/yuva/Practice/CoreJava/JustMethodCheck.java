package yuva.Practice.CoreJava;

public class JustMethodCheck {

	public static void main(String[] args) {
		Mtd m=new Mtdck();
	//	m.m1();
	}

}


class Mtd{
	private void m1() {
		System.out.println("private method Mtd");
	}
}
class Mtdck extends Mtd{
	void m1() {
		System.out.println("default method Mtdck");
	}
}