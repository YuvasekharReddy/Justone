package yuva.Practice.CoreJava;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	int limit;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit of prime num:");
	limit=sc.nextInt();
	for(int i=1;i<=limit;i++){
	boolean	isprime=true;
		for(int j=2;j<i;j++){
			if(i%j==0){
				isprime=false;
				break;
			}
			
		}
		if(isprime){
			System.out.println(limit);
		}
	}
}
}
