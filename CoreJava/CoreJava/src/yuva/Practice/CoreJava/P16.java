package yuva.Practice.CoreJava;

public class P16 {
public static void main(String[] args)throws StudentNotFoundException {
	System.out.println("main starts");
	try{
		StudentService serv=new StudentService();
		serv.getNameBySid(null);
	}catch(Exception e){
		e.printStackTrace();
	}
	System.out.println("main() ends");
}
}
 
class StudentService{
	
	String getNameBySid(String sid)throws StudentNotFoundException{
		
		if (sid==null||sid.isEmpty()||!sid.equals("JLC-099"))throw new StudentNotFoundException(sid);
	
			return "yuva";
	}
}

class StudentNotFoundException extends Exception{
	StudentNotFoundException(String sid){
		super(sid);
	}
}