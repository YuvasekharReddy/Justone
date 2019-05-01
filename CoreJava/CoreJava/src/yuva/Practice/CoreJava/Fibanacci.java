package yuva.Practice.CoreJava;

import java.util.Scanner;

public class Fibanacci {
public static void main(String[] args) {
	int f1=0,f2=1,f3=0,i,n=10;
	System.out.println(f1);
	System.out.println(f2);
	for(i=0;i<n;i++){
		f1=f2;
		f2=f3;
		f3=f1+f2;
		System.out.println("f3 "+f3);
	}
	/*int f2=0,f1=1,n,f3;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	n=sc.nextInt();
	while(f2<=n){
		System.out.println(f2);
		f3=f1+f2;
		f1=f2;
		f2=f3;
	}*/
}
}
