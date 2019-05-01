package com.yuva.logic.practice;

public class Lab608 {
	public static void main(String[] args) {
		Student1 st1=new Student1(10,"srinivas");
		Student1 st2=new Student1(10,"srinivas");
		Student1 st3=new Student1(30,"Raj");
		Student1 st4=st1;
		System.out.println("******");
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println(st1==st4);
		System.out.println(st2==st3);
		
		System.out.println("#######");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st1.equals(st4));
		System.out.println(st2.equals(st3));
		
	}
}

class Student1{
	int sid;
	String sname;
	Student1(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
	}
	public boolean equals(Object obj){
		Student1 st=(Student1)obj;
		boolean b=this.sid==st.sid&&this.sname.equals(st.sname);
		System.out.println(this.sid+"\t"+st.sid+"\t"+this.sname+"\t"+st.sname);
		System.out.println("****"+b+"****");
		return b;
		
	}
}