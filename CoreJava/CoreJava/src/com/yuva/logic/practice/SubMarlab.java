package com.yuva.logic.practice;

class Marlabs {

	public long getmethod(){
		return new Long(5);
	}
}

 class SubMarlab extends Marlabs{
	
	public long getmethod(){
		return new Long(3);
	}
	public static void main(String args[]){
		Marlabs mr=new SubMarlab();
		SubMarlab sm=new SubMarlab();
		System.out.println(mr.getmethod()+"\t"+sm.getmethod());
	}
}
