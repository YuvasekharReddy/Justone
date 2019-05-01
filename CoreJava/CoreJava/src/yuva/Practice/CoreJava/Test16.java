package yuva.Practice.CoreJava;

import java.util.Scanner;

public class Test16 {
public static void main(String[] args) {
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:");
	int num=sc.nextInt();
	while(num!=0){
		int digit=num%10;
		System.out.println("Mod digit: "+digit);
		sum=sum+digit;
		System.out.println("Sum: "+sum);
		num=num/10;
		System.out.println("num: "+num);
	}
	System.out.println("\n***sum of individual digit of a number is: "+sum );
}
}
