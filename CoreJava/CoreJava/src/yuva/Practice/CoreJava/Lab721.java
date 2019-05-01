package yuva.Practice.CoreJava;

public class Lab721 {
public static void main(String[] args) {
	System.out.println("Main Started");
	try{
		int res=10/0;
		System.out.println("Result:"+res);
		//return;
	}catch(Exception e){
		e.printStackTrace();
		System.out.println("Invalid Input");
	}
	System.out.println("Main Completed");
}
}
