package com.yuva.logic.practice;

interface GenericInterface<T>{
	T compute(T o);
}

public class Test5 {
	public static void main(String[] args) {
	
		GenericInterface<Integer> a1=(n)->{
			int fact=1;
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
			return fact;
		};
		
		int f=a1.compute(5);
		System.out.println(f);
		
		
		GenericInterface<String> a2=(s)->{
			String rev="";
			for(int i=s.length()-1;i>=0;i--) 
				rev=rev+s.charAt(i);
				return rev;
		};
		String s=a2.compute("yuva");
		System.out.println(s);
	}
}
