package com.yuva.logic.practice;

import java.util.*;


public class TestCisco {
public static void main(String[] args) {
	TreeMap hm=new TreeMap();
	hm.put(new Employeee(1,"yuva"),"yuvasekhar");
	hm.put(new Employeee(2,"raj"),"rajesh");
	hm.put(new Employeee(3,"sekhar"),"sekharreddy");
	Set s=hm.entrySet();
	Iterator it=s.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
}
}
 class Employeee implements Comparable<Employeee>{
	 int id;
	 String name;
	 Employeee(int id,String name){
		 this.id=id;
		 this.name=name;
	 }
	 public String toString(){
		 return id+"\t"+name;
	 }
	 public int compareTo(Employeee emp){
		 return this.id-emp.id;
	 }
 }
 /*TreeSet hm=new TreeSet();
	hm.add(new Employeee(1,"yuva"));
	hm.add(new Employeee(2,"raj"));
	hm.add(new Employeee(3,"sekhar"));
	Iterator it=hm.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
}
}
class Employeee implements Comparable<Employeee>{
	 int id;
	 String name;
	 Employeee(int id,String name){
		 this.id=id;
		 this.name=name;
	 }
	 public String toString(){
		 return id+"\t"+name;
	 }
	 public int compareTo(Employeee emp){
		 return this.id-emp.id;
	 }*/