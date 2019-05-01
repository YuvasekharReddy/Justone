package yuva.Practice.CoreJava;

public class Lab358 {
public static void main(String[] args) {
	Studen11t st=new Studen11t();
	st.setAge(-12);
	System.out.println(st.age);
}
}


class Studen11t{
	int age=18;
	void setAge(int age){
		if(age<18)
			return;
		this.age=age;
	}
}