package com.yuva.logic.practice;

import java.util.*;

public class Lab828 {
public static void main(String[] args) {
	System.out.println("\n**HashMap");
	Map map=new HashMap();
	map.put("sid","jlc-099");
	map.put("name","yuva");
	map.put("email","yuva@gmail.com");
	map.put("phone","1236598");
	map.put("add","Udipigarden");
	Set set=map.entrySet();
	Iterator it=set.iterator();
	while(it.hasNext()){
		System.out.println(it.next());//hashmap does not follow insertion order and any sorting order
	}                                  //it is unoreded
}
}
