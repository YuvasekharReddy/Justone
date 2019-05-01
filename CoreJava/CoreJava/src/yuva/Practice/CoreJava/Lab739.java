package yuva.Practice.CoreJava;

public class Lab739 {

	public static void main(String[] args) {
		System.out.println("main() strats");
		try{
			MYStudentService serv=new MYStudentService();
			System.out.println(serv.getNameBySid("JLC-099"));
		}catch(Exception e){
			e.printStackTrace();
		}
   System.out.println("main() ends");
	}

}

class MYStudentService{
	
	String getNameBySid(String sid){
		try {
		if(sid ==null || sid.isEmpty() || !sid.equals("JLC-099"))
			throw new MYStudentNotFoundException(sid);	
		}catch(MYStudentNotFoundException e) {
			e.printStackTrace();
		}
		return "srinivas";
	}
	
}


class MYStudentNotFoundException extends Exception{
	MYStudentNotFoundException(String sid){
		super(sid);
	}
}
/*
package yuva.Practice.CoreJava;

public class Lab739 {

	public static void main(String[] args) {
		System.out.println("main() strats");
		try{
			MYStudentService serv=new MYStudentService();
			serv.getNameBySid("JLC-099");
		}catch(Exception e){
			e.printStackTrace();
		}
   System.out.println("main() ends");
	}

}

class MYStudentService{
	String getNameBySid(String sid)throws StudentNotFoundException{
		if(sid ==null || sid.isEmpty() || !sid.equals("JLC-099"))
			throw new StudentNotFoundException(sid);
		else
			return "srinivas";
		
	}
}
class StudentNotFoundException extends Exception{
	StudentNotFoundException(String sid){
		super(sid);
	}
}*/