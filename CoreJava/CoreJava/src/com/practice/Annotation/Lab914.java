package com.practice.Annotation;

public class Lab914 {

	public static void main(String[] args) {
	
		Employee emp=new Employee(99,"sri");
		System.out.println(emp);

	}

}

class Employee{
	int eid;
	String name;
	Employee(int eid, String name){
		this.eid=eid;
		this.name=name;
	}
	public String toString() {
		return eid+"\t"+name;
	}
}