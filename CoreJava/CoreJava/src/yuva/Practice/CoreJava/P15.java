package yuva.Practice.CoreJava;
import java.util.*;

public class P15 {
	public static void main(String[] args) {
		Student stu=new Student(10,"yuva");
		stu.m1();
		
	Map map=new LinkedHashMap();
		map.put(stu,20);
		map.put(stu,10);
		
	}
}

class Student{
	int a;
	String b;
	Student(int x,String y){
	this.a=x;
	this.b=y;
	}
	void m1(){
	System.out.println(a);
    System.out.println(b);
	}
}