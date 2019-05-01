package com.yuva.logic.practice;

public class Slk {
public static void main(String[] args) {
	K k=new K();
	k.ml(12);
	k.ml(10,12);
	String x=k.ml(10,12);
	System.out.println(x);
}
}
 class K{
	 int r;
	 int ml(int a){
		 System.out.println("int method");
		 return 0;
	 }
	String ml(int a,int b){
		System.out.println("String method");
		String c="kkfgkgf";
	  return c;	
	}
 }
 class P extends K{
	 //void ml(int a){
		 
	 //}
 }