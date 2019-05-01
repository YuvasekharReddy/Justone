package com.yuva.logic.practice;

public class HCL {
public static void main(String[] args) {
	Vbn v=new Vbn();
	v.R("yuva",20);
	
	Zxc z=new Zxc();
	z.R("raj",10);
	
	Vbn vz=new Zxc();
	vz.R("mekala", 30);
	
	
}
}
 class Vbn{
	 protected Number R(String s,int a){
		 System.out.println("Vbn number");
		 return 10;
	 }
 }
 class Zxc extends Vbn{
	protected Float R(String s,int a){
		System.out.println("Zxc number");
		 return 40.0f;
	 }
 }