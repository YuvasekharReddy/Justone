package yuva.Practice.CoreJava;

import java.util.Scanner;

public class FibanacciShort {
public static void main(String[] args) {
	int a=0,b=1,n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	n=sc.nextInt();
	for(int i=0;i<=n;i++){
		System.out.println(a);
		a=a+b;
		b=a-b;
	}
	
}
}
