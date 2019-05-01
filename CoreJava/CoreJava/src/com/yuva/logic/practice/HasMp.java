package com.yuva.logic.practice;

import java.util.*;

public class HasMp {
public static void main(String[] args) {
	Map mp=new HashMap(); //we can't say which order it is display
	//Map mp=new LinkedHashMap(); //user insetion order it is display
	mp.put("sid", "JLC-099");
	mp.put("567", "sri@gmail.com");
	mp.put("name", "sri");
	mp.put("phone", "96895698");
	mp.put("add", "electronic");
	Set st=mp.entrySet();
	Iterator it=st.iterator();
	while(it.hasNext()){
		Object obj=it.next();
		System.out.println(obj);
		Map.Entry sp=(Map.Entry)obj;
		Object key=sp.getKey();
		Object values=sp.getValue();
		System.out.println(key+"\t\t"+values);	
	}
}
}
