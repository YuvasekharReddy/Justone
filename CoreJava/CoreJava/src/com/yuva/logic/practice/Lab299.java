package com.yuva.logic.practice;

public class Lab299 {
public static void main(String[] args) {
	int a=0;
	
	if(++a==0){
		a=99;
		System.out.println(a);
	}else if(++a==2){
		a=88;
	System.out.println(a);
	}else{
		System.out.println("no mathing");
	}
}
}
