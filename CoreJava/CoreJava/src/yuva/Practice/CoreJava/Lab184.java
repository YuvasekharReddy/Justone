package yuva.Practice.CoreJava;

public class Lab184 {

	public static void main(String[] args) {
		int a=23;
	final int x=25;
		switch(a){
		case 10:
			System.out.println("TEN");
			break;
		case x:
			System.out.println("value x "+x);
		case 10+13:
			System.out.println("TWENTY");
		    break;
		default:
			System.out.println("Default");
			break;
			
		}

	}

}
