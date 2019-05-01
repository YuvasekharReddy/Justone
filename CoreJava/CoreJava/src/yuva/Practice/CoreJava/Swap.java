package yuva.Practice.CoreJava;

public class Swap {
public static void main(String[] args) {
	int i=10; 
	int j=20;
	System.out.println("Before Swap "+i+"\t"+j);
	/*i=i+j;
	j=i-j;
	i=i-j;*/
	i=i*j;
	j=i/j;
	i=i/j;
			
	System.out.println("After Swap "+i+"\t"+j);
}
}
