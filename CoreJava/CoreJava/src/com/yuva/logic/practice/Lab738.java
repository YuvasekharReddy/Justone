package com.yuva.logic.practice;

public class Lab738 {
public static void main(String[] args) {
	System.out.println("main() starts");
	
try{
	StudentService serv=new StudentService();
	//serv.getNameBySid("JLC-066");
	System.out.println(serv.getNameBySid("JLC-066"));
}catch(Exception e){
	e.printStackTrace();
}
System.out.println("main() ends");
}
}
 class StudentService{
	 String getNameBySid(String sid){
		 if(sid==null||sid.isEmpty()||!sid.equals("JLC-066"))throw new StudentNotFoundException(sid);
		 else
			 return "yuva";
	 }
	
 }
 
 class StudentNotFoundException extends RuntimeException{
	 StudentNotFoundException(String sid){
		 super(sid);
	 }
 }
 
 //StudentNotFoundException()=SqlException()
 //GetNameBySid()=jdbc getConnetion(),createStatement(),execute()-----
 
 
 
                                         // like this write inside Spring