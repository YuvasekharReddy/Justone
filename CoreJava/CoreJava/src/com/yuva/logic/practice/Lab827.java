package com.yuva.logic.practice;

import java.util.*;

public class Lab827 {
public static void main(String[] args) {
	Map map=new LinkedHashMap();
	map.put("sid","jlc-099");
	map.put("name","yuva");
	map.put("email","yuva@gmail.com");
	map.put("phone","1236598");
	map.put("add","Udipigarden");
	Set set=map.entrySet();
	Iterator it=set.iterator();
	while(it.hasNext()){
		/*Object obj=it.next();
		Map.Entry entry=(Map.Entry)obj;
		Object key=entry.getKey();
		Object values=entry.getValue();
		System.out.println(key+"\t"+values);*/
		System.out.println(it.next());//it follow insertion order
		
	}
}
}
