package com.yuva.logic.practice;

import java.util.*;

public class Lab831 {
public static void main(String[] args) {
	Map map=new HashMap();
	map.put("sid","jlc-099");
	map.put("name","yuva");
	Map map2=new HashMap();
	map2.put("MKR", "Mathikere");
	map2.put("BTM", "BTMLAYOUT");
	System.out.println(map);
	System.out.println(map2);
	map.putAll(map2);
	System.out.println(map);
	System.out.println(map2);
}
}
