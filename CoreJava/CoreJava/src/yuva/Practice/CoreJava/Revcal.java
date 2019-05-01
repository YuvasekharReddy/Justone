package yuva.Practice.CoreJava;

public class Revcal {

	public static void main(String[] args) {
		
		System.out.println();

	}
	public static String revscal(String str) {
		
		if(str.isEmpty()) {
			
			return str;
		}else {
			return revscal(str.substring(1)+str.charAt(0));
		}
	}
	public String revscal1(String str) {
		
		if(str.isEmpty()) {
			return str;
		}else {
			return revscal1(str.substring(1))+str.charAt(0);	
		}
		
	}
	Revcal(){}
	public Revcal(String str){
		
         if(str.isEmpty()) {
			
			System.out.println("string is empty "+str);
		}else {
			System.out.println(str.substring(1)+str.charAt(0));
		}
	
	}

}
