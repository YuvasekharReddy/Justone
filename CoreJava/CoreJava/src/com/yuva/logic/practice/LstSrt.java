package com.yuva.logic.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class LstSrt {
public static void main(String[] args) {
	List<Student> l=new ArrayList<Student>();
	l.add(new Student(77,"yuva"));
	l.add(new Student(88,"raju"));
	l.add(new Student(99,"manu"));
	l.add(new Student(65,"jana"));
	l.add(new Student(44,"Ashok"));
	Iterator<Student> it=l.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
}
}
class Student{
	int sid;
	String sname;
	Student(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
	}
	public String toString(){
		return sid+"\t"+sname;
	}
}
class Scomparator implements Comparator{

	@Override
	public int compare(Object ob1, Object ob2) {
		if(ob1 instanceof Student && ob2 instanceof Student){
			Student s1=(Student)ob1;
			 Student s2=(Student)ob2;
			 return s1.sid-s2.sid;
		}
	 
		return 0;
	}
	
}