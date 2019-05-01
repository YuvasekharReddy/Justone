package yuva.Practice.CoreJava;

import java.util.Scanner;

public class Amstrong {
public static void main(String[] args) {
	/*int temp,n,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
    n=sc.nextInt();
	temp=n;
	while(temp!=0){
		int r=temp%10;
		sum=sum+r*r*r;
		temp=temp/10;
	}
	if(n==sum)
		System.out.println("it is Amstrong");
	else
		System.out.println("it is not Amstrong");*/
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number:");
	int n=sc.nextInt();
	System.out.println("Enter second number");
	int limit=sc.nextInt();
	for(int num=n;num<=limit;num++){
		int sum=0;
		int temp=num;
		while(temp!=0){
			System.out.println("temp *** "+temp);
			int r=temp%10;
			System.out.println("r *** "+r);
			sum=sum+r*r*r;
			System.out.println("sum *** "+sum);
			temp=temp/10;
		}
		if(sum==num)
			System.out.println("Numbers are Amstrong Numbers"+sum);
	}
	
}
}
