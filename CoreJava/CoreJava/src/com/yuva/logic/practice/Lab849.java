package com.yuva.logic.practice;


import java.util.*;

public class Lab849 {
public static void main(String[] args) {
	List list=new ArrayList();
	list.add("srinivas");
	list.add("dande");
	list.add("yuva");
	list.add("rajesh");
	list.add("reddy");
	list.add("nivas");
	System.out.println("\nSorting in ASCENDING");
	Collections.sort(list);
	System.out.println(list);
	System.out.println("\nsorting in DECENDING");
	Collections.sort(list,new StringDescComp());
	System.out.println(list);
}
}

class StringDescComp implements Comparator{
	public int compare(Object obj1,Object obj2){
		String s1=obj1.toString();
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}