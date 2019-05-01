package com.yuva.logic.practice;

public class Lab739 {
public static void main(String[] args) {
	System.out.println("main() starts");
	
try{
	StudentService1 serv=new StudentService1();//this code wrte jdbc without try catch get error
	System.out.println(serv.getNameBySid(null));
}catch(Exception e){
	e.printStackTrace();
}
System.out.println("main() ends");
}
}
 class StudentService1{
	 String getNameBySid(String sid) throws StudentNotFoundException1{
		 if(sid==null||sid.isEmpty()||!sid.equals("JLC-066"))throw new StudentNotFoundException1(sid);
		 else
			 return "yuva";
	 }
 }
 
 class StudentNotFoundException1 extends Exception{
	 StudentNotFoundException1(String sid){
		 super(sid);
	 }
 }