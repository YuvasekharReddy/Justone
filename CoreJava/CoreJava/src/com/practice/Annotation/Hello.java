package com.practice.Annotation;

@Employee1(eid = 12, ename = "yuva", phone = 16649793)
public class Hello {
 
	public static void main(String[] args) {
	   
		//System.out.println(eid);
		//System.out.println(ename);
		 Employee1 e1 = null;
		 System.out.println(e1.eid());
		 System.out.println(e1.ename());
		 System.out.println(e1.phone());
	}
	
}
