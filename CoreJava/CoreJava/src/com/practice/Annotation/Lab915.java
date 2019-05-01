package com.practice.Annotation;

public class Lab915 {

	public static void main(String[] args) {
		
		Employee11 emp=new Employee11(99,"sri");
		System.out.println(emp);

	}

}

class Employee11{
	int eid;
	String name;
	Employee11(int eid, String name){
		this.eid=eid;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return eid+"\t"+name;
	}
}
