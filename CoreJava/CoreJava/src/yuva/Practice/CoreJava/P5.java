package yuva.Practice.CoreJava;

public class P5 {
public static void main(String[] args) {
	Std s1=new Std();
	s1.setAge(12);
	System.out.println(s1.age);
}
}

class Std{
	int age=18;
	void setAge(int age){
		if(age<18)
		
		this.age=age;
		//System.out.println("hh"+age);
		return;
	}
}