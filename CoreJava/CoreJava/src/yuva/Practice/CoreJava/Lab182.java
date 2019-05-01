package yuva.Practice.CoreJava;

public class Lab182 {

	public static void main(String[] args) {
		int a=5;
		final int X=20;
		switch(a){
		case 10:
			System.out.println("TEN");
			break;
		case X:
			System.out.println("TWENTY");
			break;
		case 10+20+15:
		    System.out.println("Constant Expr");
		    break;
		default:
			System.out.println("Default");
		}

	}

}
