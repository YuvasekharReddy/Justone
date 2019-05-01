package com.yuva.logic.practice;


import java.util.*;

public class Lab798 {
public static void main(String[] args) {
	List list=new ArrayList();
	list.add("srinivas");
	list.add("Dande");
	list.add("yuva");
	
	ListIterator it=list.listIterator();
	int size=list.size();
	/*for(Object obj:list){
		if(obj.equals("Dande")) obj.set("Rajesh");
		System.out.println(obj);
	}*/
	//Iterator it=list.iterator();not possible change list using Iterator
	/*while(it.hasNext()){
		Object obj=it.next();
		System.out.println(obj);
		if(obj.equals("Dande")) it.set("raju");
	}*/
	while(it.hasNext()){
		Object obj=it.next();
		System.out.println(obj);
		if(obj.equals("Dande")) it.set("raju");
	}
	System.out.println(list);
	System.out.println("Main completed");
}
}
