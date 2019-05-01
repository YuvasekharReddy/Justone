package yuva.Practice.CoreJava;

public class TestException {
public static void main(String[] args) {
	
	try{
		System.out.println("Try block begin ");
		int a=10/0;
		System.out.println("Try block end : "+a);
		int b=10/2;
		System.out.println(b);
	}catch(Exception e){
		e.printStackTrace();
	}
	int c=10*4;
	System.out.println("c "+c);
	
	int d=29-(29*(29+1)/2);
	System.out.println("d "+d);
}
}
