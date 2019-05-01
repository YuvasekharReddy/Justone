package yuva.Practice.CoreJava;

public class Lab725 {
public static void main(String[] args) {
	System.out.println("Main() Started");
	int r=new Helll().show();
	System.out.println("Main:"+r);
	System.out.println("Main() Completed");
}
}
class Helll{
	int show(){
		int a=0;
		try{
			System.out.println("try block begins:"+a);
			a=10/0;
			System.out.println("try block ends:"+a);
			return a;
		}catch(ArithmeticException e){
			//a=20;
			System.out.println("catch block: "+a);
			//return a;
		}finally{
			a=30;
			System.out.println("finally block :"+a);
			//return a;
		
		}
		return a;
	}
}