package yuva.Practice.CoreJava;

import java.util.Scanner;

public class Test17 {
public static void main(String[] args) {
	int esum=0,osum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number: ");
	int num=sc.nextInt();
	while(num!=0){
		int digit=num%10;
		System.out.println("digit : "+digit);
		if(digit%2==0){
			esum=esum+digit;
		System.out.println("edigit++ : "+esum);
		}else{
			osum=osum+digit;
			System.out.println("odigit++ : "+osum);
		}
			num=num/10;
			System.out.println("num : "+num);
		
		}
		System.out.println("sum of Even Digit "+esum);
		System.out.println("sum of odd Digit "+osum);
}
}
